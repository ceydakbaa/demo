package com.ceyda.demo.repository;

import com.ceyda.demo.entity.Vehicle;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

    Page<Vehicle> findAll(Pageable pageable);

    Page<Vehicle> findByBrandContaining(String brand, Pageable pageable);
}
