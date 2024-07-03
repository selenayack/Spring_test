package com.example.spring1.springTest.Dto;

import com.example.spring1.springTest.entity.User;
import com.example.spring1.springTest.entity.Vehicles;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class TaskDTO {


    private String taskId;
    private String taskDescription;
    private User user;
    private Vehicles vehicle;

}
