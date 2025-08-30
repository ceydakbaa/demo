package com.ceyda.demo.service;

import com.ceyda.demo.dto.response.VehicleResponse;
import com.ceyda.demo.entity.Vehicle;
import com.ceyda.demo.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }



    public Page<VehicleResponse> findAll(int page, int size){
       Pageable pageable = PageRequest.of(page, size);

       return vehicleRepository.findAll(pageable).map(vehicle -> {
           VehicleResponse response = new VehicleResponse();
          response.setBrand(vehicle.getBrand());
          response.setModel(vehicle.getModel());
           response.setMessage(vehicle.getBrand());
           return response;
       });
    }
}
