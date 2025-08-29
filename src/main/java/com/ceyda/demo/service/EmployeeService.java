package com.ceyda.demo.service;


import com.ceyda.demo.entity.Employee;
import com.ceyda.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){ return employeeRepository.save(employee);}

    public List<Employee> findAllEmployees(){ return employeeRepository.findAll();}

    public Employee findById(Long id){ return employeeRepository.findById(id).orElse(null);}

    public Employee updateEmployee(Long id,Employee employee){
        Employee updateEmployee=employeeRepository.findById(id).orElse(null);
        updateEmployee.setFirstName(employee.getFirstName());
        updateEmployee.setLastName(employee.getLastName());
        updateEmployee.setEmail(employee.getEmail());
        updateEmployee.setSalary(employee.getSalary());
        return employeeRepository.save(updateEmployee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

    public List<Employee> findAllEmployeesByDepartment(String department){
        return employeeRepository.findByDepartment(department);
    }

    public List<Employee> findAllEmployeesByName(String name){
        return employeeRepository.findByFirstNameContaining(name);
    }
}
