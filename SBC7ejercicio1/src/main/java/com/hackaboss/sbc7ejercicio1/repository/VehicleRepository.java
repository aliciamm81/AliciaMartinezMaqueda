package com.hackaboss.sbc7ejercicio1.repository;

import com.hackaboss.sbc7ejercicio1.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {
    List<Vehicle> vehicleList = new ArrayList<>();
    public void createVehicles(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    public List<Vehicle> findVehicles(){
        return this.vehicleList;
    }

}
