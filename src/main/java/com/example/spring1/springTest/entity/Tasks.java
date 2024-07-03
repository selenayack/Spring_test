package com.example.spring1.springTest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="TASKS")
@Getter
@Setter

public class Tasks {
    @Id
    @Column(name = "task_id", nullable = false)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String taskId;


    @Column(name="task_description",nullable = false, length = 50)
    private String taskDescription;

    @ManyToOne
    @JoinColumn(name = "task_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "task_vehicle_id")
    private Vehicles vehicle;






}
