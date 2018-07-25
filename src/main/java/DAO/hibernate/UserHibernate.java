package DAO.hibernate;

import DAO.UserRepository;
import model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class UserHibernate implements UserRepository {

    public User getUserById(int id) {
        Session session = null;
        User user = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            user = session.find(User.class, id);
            }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return user;
    }

    public User saveUser(User user) {
        return null;
    }

    public void deleteUser(User user) {
        Session session = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }
        catch (Exception y){}
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    public User updateUser(User user) {
        return null;
    }

    public Collection<User> getAllUsers() {
        Session session = null;
        List<User> users = new ArrayList<User>();
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            users = session.createCriteria(User.class).list();
        }
        catch (Exception ex){}
        finally {
            if (session != null && session.isOpen()) session.close();
        }
        return users;
    }
}
