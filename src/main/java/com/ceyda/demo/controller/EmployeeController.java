package com.ceyda.demo.controller;


import com.ceyda.demo.entity.Employee;
import com.ceyda.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee create( @RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> find(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable(name = "id") Long id){
        return employeeService.findById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable(name ="id") Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable(name = "id") Long id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/name")
    public List<Employee> findAllEmployeesByName(@RequestParam String name){
        return employeeService.findAllEmployeesByName(name);
    }

    @GetMapping("/department")
    public List<Employee>  findByEmployeesByDepartment(@RequestParam String department){
        return employeeService.findAllEmployeesByDepartment(department);
    }
}
