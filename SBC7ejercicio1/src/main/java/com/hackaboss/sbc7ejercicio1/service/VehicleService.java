package com.hackaboss.sbc7ejercicio1.service;

import com.hackaboss.sbc7ejercicio1.model.Vehicle;
import com.hackaboss.sbc7ejercicio1.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class VehicleService implements IVehicleService {

    @Autowired
    VehicleRepository vehicleRepository;
    @Override
    public String createVehicles(List<Vehicle> vehicleList) {

        vehicleList.forEach(p ->{
            p.setId(vehicleRepository.findVehicles().size()+1L);
            vehicleRepository.createVehicles(p);
        });

        return "Vehiculos creados correctamente";
    }
    @Override
    public List<Vehicle> findVehicles() {
        return vehicleRepository.findVehicles();
    }

    @Override
    public List<Vehicle> findVehiclesOrderPrice() {
        return vehicleRepository.findVehicles().stream()
                .sorted(Comparator.comparing(Vehicle::getPrice))
                .toList();
    }

    @Override
    public Vehicle findVehiclesById(Long id) {

        return vehicleRepository.findVehicles().stream()
                .filter(p-> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
