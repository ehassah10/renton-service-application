package com.renton.application.service;

import com.renton.application.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    User save(User user);
    void delete(Long id);
}
