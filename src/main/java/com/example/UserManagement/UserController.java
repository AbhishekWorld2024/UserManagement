package com.example.UserManagement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employees")
public class UserController {

    private final UserService userService;

    // Constructor Injection for UserService
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Get all people (Employees)
    @GetMapping
    public List<Employee> getAllPeople() {
        return userService.getAllPeople();
    }

    // Add a new person (Employee)
    @PostMapping
    public Employee addPerson(@RequestBody Employee employee) {
        return userService.addPerson(employee);
    }
}
