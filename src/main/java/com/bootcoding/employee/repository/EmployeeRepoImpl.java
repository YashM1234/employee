package com.bootcoding.employee.repository;
import com.bootcoding.employee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
    Map<Integer, Employee> employeeMap = new HashMap<>();

    //<------create employee-------->
    @Override
    public String createEmployee(Employee employee) {
        if (existEmployee(employee)) {
            return "Employee Already Exist!";
        }
        employeeMap.put(employee.getEmpId(), employee);
        return "Employee Inserted Successfully";
    }

    //<------get all employee data-------->
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeesList = new ArrayList<>();
        for(Integer empId: employeeMap.keySet()){
            employeesList.add(employeeMap.get(empId));
        }
        return employeesList;
    }

    //<------get employee data by id-------->
    @Override
    public Object getEmployee(int empId) throws RuntimeException {
        if (existEmployee(empId)) {
            return employeeMap.get(empId);
        }
        throw new RuntimeException("Employee not Exist!");
    }

    //<------get all employee data department wise-------->
    @Override
    public List<Employee> getEmployeeByDepartment(String department) {
        List<Employee> employeeList = new ArrayList<>();
        for(Integer empId: employeeMap.keySet()){
            employeeList.add(employeeMap.get(empId));
        }
        return employeeList;
    }

    //<------update/modify employee data by id-------->
    @Override
    public Employee updateEmployee(int empId, Employee employee) {
        if(existEmployee(empId)){
            employeeMap.put(empId, employee);
            return employee;
        }
        return null;
    }

    //<------Delete employee data by id-------->
    @Override
    public String deleteEmployee(int empId) {
        if(existEmployee(empId)){
            employeeMap.remove(empId);
            return "Employee Remove Successfully";
        }
        return "Employee Doesn't Exist";
    }

    //<------helper method-------->
    private boolean existEmployee(Employee employee) {
        return existEmployee(employee.getEmpId());
    }

    private boolean existEmployee(int empId) {
        if(employeeMap.containsKey(empId)){
             return true;
        }
        return false;
    }

}
