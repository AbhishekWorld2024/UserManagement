<h2>User Management System with Spring Boot Profiles</h2><br>
This Spring Boot application manages employees by utilizing Spring Profiles to configure different database environments for development, testing, and production. The <br>application allows viewing and adding employees, storing data in different databases based on the environment.<br><br>

Project Overview<br>
This project demonstrates how to use Spring Boot Profiles to switch between different database configurations dynamically. Employees are managed and stored in separate databases for each environment:<br>

Development (Dev) → Uses H2 (In-Memory Database)<br>
Testing (Test) → Uses MySQL Database<br>
Production (Prod) → Uses PostgreSQL Database<br><br>
Features<br>
✅ View all employees stored in the database<br>
✅ Add new employees to the respective environment's database<br>
✅ Uses Spring Boot Profiles to automatically switch configurations<br>
✅ Supports H2, MySQL, and PostgreSQL databases<br>
✅ REST API endpoints for managing employees<br>
