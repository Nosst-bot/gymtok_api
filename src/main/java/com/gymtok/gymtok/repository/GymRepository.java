package com.gymtok.gymtok.repository;

import com.gymtok.gymtok.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository<Gym, Integer> {
}
