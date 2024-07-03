package com.example.spring1.springTest.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String userId;

    @Column(name = "user_email", nullable = false, length = 50)
    private String userEmail;


    @Column(name = "user_name", nullable = false, length = 30)
    private String userName;




}

