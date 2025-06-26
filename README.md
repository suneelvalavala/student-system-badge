             
             
             
                              Student Badge System - Spring Boot 
-----------------------------------------------------------------------------------------------

Overview
---------

This is a backend system project developed by using Spring Boot that evaluates and awards badges to students based on predefined academic performance criteria. The system uses a RESTful API architecture, and the data is stored in mysql  database for simplicity. JWT-based authentication is used to secure endpoints. 



Key Features:
--------------

* Add and retrieve student data

* Evaluate and assign badges based on performance:
.................................................

1---> Course Completion: If student has completed 3 or more courses

2---> High Performer: If average score is 80% or above

3---> Capstone Contributor: If a student has uploaded a project

* JWT Authentication for protected endpoints

Technologies Used
------------------

* Java 17

* Spring Boot 3.x

* Spring Security + JWT

* mySql database

* Maven for build automation


How to Run the Application
---------------------------

Clone the repository:
--------------------

* git clone https://github.com/your-repo/student-badge-system.git

* cd student-badge-system

* Import into an IDE like IntelliJ or Eclipse as a Maven project.

Run the application using:
-----------------------------

* mvn spring-boot:run



mySql  Database :
-----------------

spring.application.name=student-system-badge
spring.datasource.url=jdbc:mysql://localhost:3306/student_badge
spring.datasource.username=root
spring.datasource.password=12345
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Endpoints Summary

Authentication:
-----------------

POST /authenticate: –---> Login and receive JWT token


Badge APIs:
-----------

POST :
------
/api/badges/evaluate/{studentId} – Evaluate and assign badges

GET :
--------
/api/student/{id}/badges – Get student name with awarded badges

Security:
--------

* Token is required for accessing protected endpoints

* Use the token in the Authorization header:

* Authorization: Bearer <token>



Author:
-----------

Prepared by: Suneel Valavala
Backend Developer - Java | Spring Boot
