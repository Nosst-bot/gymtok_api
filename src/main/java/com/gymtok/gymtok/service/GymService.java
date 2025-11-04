package com.gymtok.gymtok.service;

import com.gymtok.gymtok.model.Gym;
import com.gymtok.gymtok.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymService {

    @Autowired
    private GymRepository gymRepository;

    public List<Gym> getAllGym() {
        return gymRepository.findAll();
    }
}
