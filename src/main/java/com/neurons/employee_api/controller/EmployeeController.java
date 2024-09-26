package com.neurons.employee_api.controller;

import com.neurons.employee_api.dto.EmployeeDTO;
import com.neurons.employee_api.model.Employee;
import com.neurons.employee_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //Get all employees

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //Get employees by id

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable() Long id){
        return employeeService.getEmployyeById(id);
    }

    // Create new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

}
