package controller;

import DAO.UserRepository;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        return repository.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable String id){
        return repository.getUserById(Integer.parseInt(id));
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user){
        repository.updateUser(user);
        return user;
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public User deleteUser(@RequestBody User user){
        repository.deleteUser(user);
        return user;
    }
}
