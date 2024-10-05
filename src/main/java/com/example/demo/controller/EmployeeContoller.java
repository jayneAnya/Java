package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeContoller {
    private final List<Employee> employeeList = new ArrayList<>();

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
    }

    @GetMapping("/employee")
    public String getEmployee(){
        return employeeService.getEmployeeName();
    }
}
