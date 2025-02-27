package com.example.EmployeePayRoll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Declares the class as the controller
@RequestMapping("/api/test") // Root URL

public class EmployeeController {

    // Inject the service using autowired
    @Autowired
    private  EmployeeService employeeService;

    // Handle the REST APIs
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createRecord(employeeDTO);
    }



}