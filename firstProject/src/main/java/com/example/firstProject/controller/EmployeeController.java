package com.example.firstProject.controller;

import com.example.firstProject.entity.Employee;
import com.example.firstProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
//        return employeeService.getEmployeeById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employeeDetails) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, employeeDetails));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

}