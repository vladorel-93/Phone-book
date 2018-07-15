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
        return users.get(id);
    }

    public User saveUser(User user) {
        user.setId(counter.incrementAndGet());
        return users.put(user.getId(), user);
    }

    public void deleteUser(User user) {
        users.remove(user.getId());
    }

    public User updateUser(User user) {
        return users.put(user.getId(), user);
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }
}
