package DAO.mock;

import DAO.UserRepository;
import model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserRepMock implements UserRepository {

    private static Map<Integer, User> users = new HashMap<Integer, User>();

    static AtomicInteger counter = new AtomicInteger(0);

    static {
        users.put(counter.addAndGet(1), new User("Roma", "89168225012", "Varshavka", counter.get()));
    }

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
