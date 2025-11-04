package com.gymtok.gymtok.controller;

import com.gymtok.gymtok.model.Gym;
import com.gymtok.gymtok.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GymController {

    @Autowired
    private GymService gymService;

    @GetMapping("/gym")
    public List<Gym> getAllGym() {
        return gymService.getAllGym();
    }
}
