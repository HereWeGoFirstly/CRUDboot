package ru.kzub.CRUDboot.dao;

import ru.kzub.CRUDboot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void deleteById(int id);

    void update(int id, User user);

    User getUserById(int id);
}