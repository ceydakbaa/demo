package com.ceyda.demo.repository;

import com.ceyda.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    List<Employee> findByFirstNameContaining(String firstName);

    List<Employee> findByDepartment(String department);

    @Query("SELECT e FROM Employee e WHERE e.salary > :amount")
    List<Employee> findBySalaryGreaterThan(@Param("amount") Double amount);

    @Query(value= "SELECT * FROM employee WHERE department = : dept", nativeQuery = true)
    List<Employee> findByyDepartment(@Param("dept") String dept);

}
