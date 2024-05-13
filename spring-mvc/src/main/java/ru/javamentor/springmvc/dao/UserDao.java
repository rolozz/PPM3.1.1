package ru.javamentor.springmvc.dao;

import ru.javamentor.springmvc.model.User;
import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);

}
