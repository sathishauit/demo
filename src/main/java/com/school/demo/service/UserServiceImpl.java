package com.school.demo.service;

import com.school.demo.models.User;
import com.school.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        User user1 = null;
        try {
            user1 = userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user1;
    }

    @Override
    public List<User> getAll() {
        List<User> userList = null;
        try {
            userList = userRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}
