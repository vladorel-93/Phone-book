package DAO;

import model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserRepMock implements UserRepository{
    private Map<Integer, User> users = new HashMap<Integer, User>();

    AtomicInteger counter = new AtomicInteger(0);

    public User getUserById(int id) {
        return null;
    }

    public User saveUser(User user) {
        return null;
    }

    public void deleteUser(User user) {

    }

    public User updateUser(User user) {
        return null;
    }

    public Collection<User> getAllUsers() {
        return null;
    }
}
