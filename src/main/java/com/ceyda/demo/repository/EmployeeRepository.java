package com.ceyda.demo.repository;

import com.ceyda.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    List<Employee> findByFirstNameContaining(String firstName);

    List<Employee> findByDepartment(String department);


}
