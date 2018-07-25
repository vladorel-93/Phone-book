package DAO;

import model.User;

import java.util.Collection;

public interface UserRepository {

    public static final String  FIND_ALL = "SELECT* FROM Users";

    public static final String FIND_BY_ID = FIND_ALL + " WHERE id = ?";

    public static final String DELETE = "DELETE FROM Users WHERE id = ?";

    public static final String SAVE_USER = "INSERT INTO Users (name, address, phone) VALUES (?, ?, ?)";

    User getUserById(int id);
    User saveUser(User user);
    void deleteUser(User user);
    User updateUser(User user);
    Collection<User> getAllUsers();
}
