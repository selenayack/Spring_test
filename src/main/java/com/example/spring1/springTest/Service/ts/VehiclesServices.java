package com.example.spring1.springTest.Service.ts;


import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.Dto.VehicleDTO;
import com.example.spring1.springTest.entity.User;
import com.example.spring1.springTest.entity.Vehicles;
import com.example.spring1.springTest.Repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  VehiclesServices {

    VehicleDTO save(VehicleDTO vehiclesDTO);


    List<Vehicles> getAllVehicles();

    Vehicles getVehicleById(String  id);




}
