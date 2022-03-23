package ru.kzub.CRUDboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kzub.CRUDboot.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
}