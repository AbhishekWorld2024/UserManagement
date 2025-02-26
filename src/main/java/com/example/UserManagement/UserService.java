package com.example.UserManagement;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final EmployeeRepository employeeRepository;

    // Constructor Injection
    public UserService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Get all employees
    public List<Employee> getAllPeople() {
        return employeeRepository.findAll();
    }

    // Add a new employee
    public Employee addPerson(Employee employee) {
        return employeeRepository.save(employee);
    }
}
