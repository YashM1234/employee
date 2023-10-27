# employee
employee project on spring boot, all CRUD operation perform, in memory

# Model
Employee :
*    empId
*    name
*    emailId
*    gender
*    dob
*    employeeType
*    department
*    jobTitle
*    joiningDate

# Flow
UI(we use postman) <--> EmployeeController(C) <--> 
EmployeeService(I) <--> EmployeeServiceImpl(C) <--> 
EmployeeRepo(I) <--> EmployeeRepoImpl(C)
