package com.example.EmployeePayRoll;

import org.springframework.web.bind.annotation.*;

@RestController // Declares the class as the controller
@RequestMapping("/api/test") // Root URL

public class EmployeeController {

    // GET request - Fetch Data
    @GetMapping
    public String getData() {
        Employee employee = new Employee("kritika", 50000);
        return "GET Request: Data fetched successfully!";
    }

    // POST request - Create Data
    @PostMapping
    public String postData() {
        return "POST Request: Data created successfully!";
    }



}