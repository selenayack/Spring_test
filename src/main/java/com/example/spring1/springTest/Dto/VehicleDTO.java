package com.example.spring1.springTest.Dto;

import com.example.spring1.springTest.entity.Tasks;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor

public class VehicleDTO {


    private String vehicleId;
    private String vehicleModel;
    private int vehicleYear;
    private List<Tasks> tasks;
}
