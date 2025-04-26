package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllDoctors() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getDoctorById(@PathVariable Long employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    @GetMapping("/{employeeStatus}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getDoctorsByStatus(@PathVariable String status) {
        return employeeRepository.findByStatus(status);
    }

    @GetMapping("/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getDoctorsByDepartment(@PathVariable String department) {
        return employeeRepository.findByDepartment(department);
    }


}
