package com.bootcoding.employee.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int empId;
    private String name;
    private String emailId;
    private String gender;
    private String dob;
    private String employeeType;
    private String department;
    private String jobTitle;
    private String joiningDate;

}
