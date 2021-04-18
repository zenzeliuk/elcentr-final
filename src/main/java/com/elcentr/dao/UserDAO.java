package com.elcentr.dao;

import com.elcentr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    List<User> findAllByEmail(String userEmail);
    List<User> findAllByLogin(String login);
    User findUserByLoginAndPassword(String login, String password);
    User findFirstByLogin(String login);
}
