package com.bootcoding.employee.controller;

import com.bootcoding.employee.model.Employee;
import com.bootcoding.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //<------create employee-------->
    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    //<------get all employee data-------->
    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    //<------get employee data by id-------->
    @GetMapping("/employee/empId")
    public Object getEmployee(@PathVariable int empId) {
        try {
            return employeeService.getEmployee(empId);
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    //<------get all employee data department wise-------->
    @GetMapping("/employee/department/{department}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String department) {
        return employeeService.getEmployeeByDepartment(department);
    }

    //<------update/modify employee data by id-------->
    @PutMapping("/employee/{empId}")
    public Employee updateEmployee(@PathVariable int empId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(empId, employee);
    }

    //<------Delete employee data by id-------->
    @DeleteMapping("/employee/{empId}")
    public String deleteEmployee(@PathVariable int empId) {
        return employeeService.deleteEmployee(empId);
    }
}
