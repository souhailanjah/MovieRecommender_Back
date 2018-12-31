package com.ps.userportal.services;

import java.util.List;

import com.ps.userportal.entities.User;

public interface UserService {

    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);
}
