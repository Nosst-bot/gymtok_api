package com.gymtok.gymtok.controller;

import com.gymtok.gymtok.model.User;
import com.gymtok.gymtok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        User existingUser = userService.getUserByEmail(user.getEmail());

        if (existingUser != null) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("El correo ya está registrado");
        }

        userService.createUser(user);
        return ResponseEntity.ok("Usuario registrado exitosamente");
    }

    @PostMapping("/user/login")
    public User login(@RequestParam String email, @RequestParam String password) {

        return userService.login(email, password);

    }

}
