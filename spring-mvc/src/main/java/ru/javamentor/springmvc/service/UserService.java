package ru.javamentor.springmvc.service;

import ru.javamentor.springmvc.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);

}
