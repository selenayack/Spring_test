package com.example.spring1.springTest.controller;

import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.Dto.VehicleDTO;
import com.example.spring1.springTest.Service.ts.UserService;
import com.example.spring1.springTest.Service.ts.VehiclesServices;
import com.example.spring1.springTest.entity.User;
import com.example.spring1.springTest.entity.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/vehicles")
public class VehicleController {


    private VehiclesServices vehicleService;

    public VehicleController(VehiclesServices vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/getAll")

    public ResponseEntity<List<Vehicles>> getAllVehicles() {
            return ResponseEntity.ok(vehicleService.getAllVehicles());
        }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicles> getVehicleById(@PathVariable String id) {
        return ResponseEntity.ok(vehicleService.getVehicleById(id));
    }



    @PostMapping("/save")
    public ResponseEntity<VehicleDTO> createVehicle(@RequestBody VehicleDTO vehicleDTO) {

        return ResponseEntity.ok(vehicleService.save(vehicleDTO));

    }


}


