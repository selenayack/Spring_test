package com.example.spring1.springTest.Service.Impl;

import com.example.spring1.springTest.Dto.VehicleDTO;
import com.example.spring1.springTest.Repository.VehicleRepo;
import com.example.spring1.springTest.Service.ts.VehiclesServices;
import com.example.spring1.springTest.entity.Vehicles;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehiclesServices {

    private final VehicleRepo vehicleRepo;

    public VehicleServiceImpl(VehicleRepo vehicleRepo){
        this.vehicleRepo=vehicleRepo;
    }


    @Override
    public VehicleDTO save(VehicleDTO vehiclesDTO) {
        Vehicles vehicles= new Vehicles();
        vehicles.setVehicleModel(vehiclesDTO.getVehicleModel());
        vehicles.setVehicleYear(vehiclesDTO.getVehicleYear());
        vehicles.setVehicleId(vehicles.getVehicleId());
        Vehicles vehicles1=vehicleRepo.save(vehicles);
        vehiclesDTO.setVehicleId(vehicles1.getVehicleId());

        return  vehiclesDTO;
    }

    @Override
    public List<Vehicles> getAllVehicles() {
         return vehicleRepo.findAll();
    }

    @Override
    public Vehicles getVehicleById(@PathVariable  String id) {
        return vehicleRepo.findById(id).get();
    }
}
