package ru.kzub.CRUDboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kzub.CRUDboot.dao.UserDao;
import ru.kzub.CRUDboot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Override
    public void deleteById(int id) {
        userDao.deleteById(id);
    }


    @Override
    public User getUserById(int id) {
        return userDao.getById(id);
    }
}
