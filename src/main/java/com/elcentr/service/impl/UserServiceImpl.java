package com.elcentr.service.impl;

import com.elcentr.dao.UserDAO;
import com.elcentr.model.User;
import com.elcentr.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static ch.qos.logback.core.util.OptionHelper.isEmpty;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Override
    public User create(User user) {
        if (isNull(user.getId()) &&
                !isEmpty(user.getLogin()) &&
                !isEmpty(user.getPassword()) &&
                !findAll().contains(user)
        ) {
            return userDAO.save(user);
        }
        throw new RuntimeException("User can not be created.");
    }

    @Override
    public User update(User user) {
        if (nonNull(user.getId()) &&
                !isEmpty(user.getLogin()) &&
                !isEmpty(user.getPassword()) &&
                !findAll().contains(user)
        ) {
            return userDAO.save(user);
        }
        throw new RuntimeException("User can not be updated.");
    }

    @Override
    public User findOneById(Integer id) {
        return userDAO.findById(id)
                .orElseThrow(() -> new RuntimeException("User was not found"));
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        userDAO.deleteById(id);
    }

}
