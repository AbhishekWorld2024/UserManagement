User Management System with Spring Boot Profiles
This Spring Boot application manages employees by utilizing Spring Profiles to configure different database environments for development, testing, and production. The application allows viewing and adding employees, storing data in different databases based on the environment.

Project Overview
This project demonstrates how to use Spring Boot Profiles to switch between different database configurations dynamically. Employees are managed and stored in separate databases for each environment:

Development (Dev) → Uses H2 (In-Memory Database)
Testing (Test) → Uses MySQL Database
Production (Prod) → Uses PostgreSQL Database
Features
✅ View all employees stored in the database
✅ Add new employees to the respective environment's database
✅ Uses Spring Boot Profiles to automatically switch configurations
✅ Supports H2, MySQL, and PostgreSQL databases
✅ REST API endpoints for managing employees
