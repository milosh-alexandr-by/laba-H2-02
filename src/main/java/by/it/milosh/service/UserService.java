package by.it.milosh.service;

import by.it.milosh.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> findAll();

}
