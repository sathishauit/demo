package com.school.demo.api;

import com.school.demo.models.User;
import com.school.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        List<User> userList = userService.getAll();
        return userList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        User user1 = userService.save(user);
        return user1;
    }
}
