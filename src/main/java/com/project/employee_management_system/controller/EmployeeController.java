package com.project.employee_management_system.controller;

import com.project.employee_management_system.model.Employee;
import com.project.employee_management_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees,HttpStatus.OK );
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employee,HttpStatus.CREATED);
    }


}
