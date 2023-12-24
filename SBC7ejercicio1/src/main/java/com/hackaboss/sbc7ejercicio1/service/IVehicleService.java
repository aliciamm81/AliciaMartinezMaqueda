package com.hackaboss.sbc7ejercicio1.service;

import com.hackaboss.sbc7ejercicio1.model.Vehicle;

import java.util.List;

public interface IVehicleService {

    public String createVehicles(List<Vehicle> vehicleList);
    public List<Vehicle> findVehicles();
    public List<Vehicle> findVehiclesOrderPrice();
    public Vehicle findVehiclesById(Long id);

}
