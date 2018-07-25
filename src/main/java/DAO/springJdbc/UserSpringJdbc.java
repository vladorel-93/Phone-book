package DAO.springJdbc;

import DAO.UserRepository;
import model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

@Component
public class UserSpringJdbc implements UserRepository {

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    JdbcTemplate jdbcTemplate;

    public User getUserById(int id) {
        User user = null;
        try{
            user = jdbcTemplate.queryForObject(FIND_BY_ID, new Object[]{id}, new RowMapper<User>() {
                public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setAddress(resultSet.getString("address"));
                    user.setPhone(resultSet.getString("phone"));
                    return user;
                }
            });
        }
        catch (EmptyResultDataAccessException c){logger.info("Empty result");}
        return user;
    }

    public User saveUser(User user) {
        return null;
    }

    public void deleteUser(User user) {
        jdbcTemplate.update(DELETE, user.getId());
    }

    public User updateUser(User user) {
        String updateSQL = "";
        return null;
    }

    public Collection<User> getAllUsers() {
        return jdbcTemplate.query(FIND_ALL, new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setAddress(resultSet.getString("address"));
                user.setPhone(resultSet.getString("phone"));
                return user;
            }
        });
    }
}
