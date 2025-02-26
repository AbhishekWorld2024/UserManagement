package com.example.UserManagement;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {


@Id
    private int id;
    private String name;
    private String Email;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

}
