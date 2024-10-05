package com.example.demo;

import com.example.demo.services.EmployeeService;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeServiceTest {
    private EmployeeService employeeService = new EmployeeService();
    @Test
    public void testGetEmployeeNane(){
        String name = employeeService.getEmployeeName();
        assertEquals("John Doe", name);
    }
}
