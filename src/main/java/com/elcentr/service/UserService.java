package com.elcentr.service;

import com.elcentr.model.User;

import java.util.List;

public interface UserService {

    User create(User user);
    User update(User user);
    User findOneById(Integer id);
    List<User> findAll();
    void deleteById(Integer id);

}
