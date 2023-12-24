package com.hackaboss.sbc7ejercicio1.controller;

import com.hackaboss.sbc7ejercicio1.model.Vehicle;
import com.hackaboss.sbc7ejercicio1.service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    IVehicleService iVehicleService;

    @PostMapping
    public String createVehicles(@RequestBody List<Vehicle> vehicleList){

       return iVehicleService.createVehicles(vehicleList);
    }

    @GetMapping
    public List<Vehicle> findVehicles(){
        return iVehicleService.findVehicles();
    }

    @GetMapping("/prices")
    public List<Vehicle> findVehiclesOrderPrice(){
        return iVehicleService.findVehiclesOrderPrice();
    }

    @GetMapping("/{id}")
    public Vehicle findVehiclesById(@PathVariable Long id){
        return iVehicleService.findVehiclesById(id);
    }

}
