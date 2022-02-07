package com.school.demo.service;

import com.school.demo.models.User;

import java.util.List;

public interface UserService {
    public User save(User user);
    public List<User> getAll();
}
