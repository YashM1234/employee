package com.bootcoding.employee.controller;

import com.bootcoding.employee.model.Employee;
import com.bootcoding.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/empId")
    public Object getEmployee(@PathVariable int empId) {
        try {
            return employeeService.getEmployee(empId);
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("/employee/department/{department}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String department) {
        return employeeService.getEmployeeByDepartment(department);
    }

    @PutMapping("/employee/{empId}")
    public Employee updateEmployee(@PathVariable int empId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(empId, employee);
    }

    @DeleteMapping("/employee/{empId}")
    public String deleteEmployee(@PathVariable int empId) {
        return employeeService.deleteEmployee(empId);
    }
}
