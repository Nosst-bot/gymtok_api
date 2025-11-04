package com.gymtok.gymtok.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "gym")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private double lat;
    private double lng;
    private String photoUrl;
    private String websiteUrl;
}
