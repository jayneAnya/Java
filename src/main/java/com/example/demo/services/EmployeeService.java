package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public String getEmployeeName(){
        return "John Doe";
    }
}
