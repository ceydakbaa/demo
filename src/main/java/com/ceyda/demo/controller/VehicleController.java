package com.ceyda.demo.controller;


import com.ceyda.demo.dto.response.VehicleResponse;
import com.ceyda.demo.entity.Vehicle;
import com.ceyda.demo.service.UserService;
import com.ceyda.demo.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @PostMapping
    public Vehicle create(@RequestBody Vehicle vehicle){
        return vehicleService.createVehicle(vehicle);
    }


    @GetMapping("/all")
    public Page<VehicleResponse> getVehicles(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
       return vehicleService.findAll(page, size);
    }

}
