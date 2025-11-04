package com.gymtok.gymtok.controller;

import com.gymtok.gymtok.model.User;
import com.gymtok.gymtok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
