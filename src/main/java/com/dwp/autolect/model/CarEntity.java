package com.dwp.autolect.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String make;
    private String model;
    private String trim;
    private int year;
    private String driveType;
    private String transmission;
    private String engineType;
    private float power;
    private String acceleration;
    private float topSpeed;
    private float weight;
    private float torque;
    private String mpg;
    private float userRating;
    private float performanceScore;
}
