package com.bootcoding.employee.repository;

import com.bootcoding.employee.model.Employee;

import java.util.List;

public interface EmployeeRepo {
    String createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Object getEmployee(int empId);

    List<Employee> getEmployeeByDepartment(String department);

    Employee updateEmployee(int empId, Employee employee);

    String deleteEmployee(int empId);
}
