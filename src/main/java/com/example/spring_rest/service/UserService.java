package com.example.spring_rest.service;

import com.example.spring_rest.model.User;

import java.util.List;

public interface UserService {
    List<User> allUser();

    void add(User user);

    void remove(long id);

    void edit(User user);

    User getById(long id);

    User getUserByUsername(String name);

    User getUserByEmail(String email);
}
