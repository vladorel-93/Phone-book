package DAO;

import model.User;

import java.util.Collection;

public interface UserRepository {
    User getUserById(int id);
    User saveUser(User user);
    void deleteUser(User user);
    User updateUser(User user);
    Collection<User> getAllUsers();
}
