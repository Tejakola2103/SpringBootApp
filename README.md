# SpringBootApp

Insurance Trainee Management System

A Spring Boot REST API application that manages insurance trainee records.
The application allows organizations to create, read, update, and delete trainee information efficiently.

Project Description

The Insurance Trainee Management System is designed to manage trainee details in an insurance company.

The system helps administrators:

Register new trainees

View trainee records

Update trainee details

Remove trainees from the system

This project demonstrates RESTful API development using Spring Boot and Spring Data JPA.

Tech Stack
Technology	Purpose
Java 17	Backend programming
Spring Boot	Application framework
Spring Data JPA	Database operations
Hibernate	ORM
MySQL / H2	Database
Maven	Build tool
Postman	API Testing
Features

Create Trainee

Get All Trainees

Get Trainee by ID

Update Trainee Information

Delete Trainee

Exception Handling

RESTful Architecture

Project Architecture
Controller Layer  → Handles HTTP Requests
Service Layer     → Business Logic
Repository Layer  → Database Interaction
Model Layer       → Entity Classes
Exception Layer   → Custom Exceptions
Project Structure
InsuranceTraineeApp
│
├── src/main/java/com/example/insurance
│
│   ├── controller
│   │      └── TraineeController.java
│
│   ├── service
│   │      └── TraineeService.java
│
│   ├── repository
│   │      └── TraineeRepository.java
│
│   ├── model
│   │      └── Trainee.java
│
│   ├── exception
│   │      └── ResourceNotFoundException.java
│
│   └── InsuranceTraineeApplication.java
│
└── resources
       └── application.properties
API Endpoints
Method	Endpoint	Description
POST	/api/trainees	Create trainee
GET	/api/trainees	Get all trainees
GET	/api/trainees/{id}	Get trainee by ID
PUT	/api/trainees/{id}	Update trainee
DELETE	/api/trainees/{id}	Delete trainee
