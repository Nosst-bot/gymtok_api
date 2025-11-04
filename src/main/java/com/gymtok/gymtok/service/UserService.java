package com.gymtok.gymtok.service;

import com.gymtok.gymtok.model.User;
import com.gymtok.gymtok.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.getReferenceById(id);
    }
}
