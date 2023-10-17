package com.bootcoding.employee.service;
import com.bootcoding.employee.model.Employee;
import com.bootcoding.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public String createEmployee(Employee employee) {
        return employeeRepo.createEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.getAllEmployee();
    }

    @Override
    public Object getEmployee(int empId) {
        return employeeRepo.getEmployee(empId);
    }

    @Override
    public List<Employee> getEmployeeByDepartment(String department) {
        return employeeRepo.getEmployeeByDepartment(department);
    }

    @Override
    public Employee updateEmployee(int empId, Employee employee) {
        return employeeRepo.updateEmployee(empId, employee);
    }

    @Override
    public String deleteEmployee(int empId) {
        return employeeRepo.deleteEmployee(empId);
    }
}
