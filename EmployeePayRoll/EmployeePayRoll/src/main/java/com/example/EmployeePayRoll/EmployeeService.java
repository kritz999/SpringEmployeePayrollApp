package com.example.EmployeePayRoll;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
// Converts EmployeeDTO to an Employee Model
// Handles the business logic delegated by Rest Controller
public class EmployeeService {
    // Store employees in memory
    private final List<Employee> employeeList = new ArrayList<>();

    public  Employee createRecord(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        return employee;
    }
    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
