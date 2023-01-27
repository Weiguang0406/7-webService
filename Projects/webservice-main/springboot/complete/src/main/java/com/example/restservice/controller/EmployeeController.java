package com.example.restservice.controller;

import com.example.restservice.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This is a REST API

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    //GET all the employees
    @GetMapping("/")
    public List<Employee> getAll(){
        return List.of(Employee.builder().id(1L).employeeName("Chris").age(20).build(),
                        Employee.builder().id(2L).employeeName("Rosy").age(25).build(),
                        Employee.builder().id(3L).employeeName("Jill").age(30).build()
                );
    }
    //Get the employee by id

    //Get the employee by name

    //Create an employee

    //Update an employee

    //Delete an employee
}
