package com.example.spring1.springTest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="VEHICLES")
public class Vehicles {

    @Id
    @Column(name = "vehicle_id", nullable = false)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String vehicleId;

    @Column(name="vehicle_model",nullable = false, length = 20)
    private String vehicleModel;

    @Column(nullable = false)
    private int vehicleYear;





}
