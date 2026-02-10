# User Authentication System # 

---
## 🚀 Project Overview

A backend Spring Boot application that allows users to register, log in and implements user authentication using JWT (JSON Web Tokens) for secure API access and Password are securely using Bcrypt and store to MySql Database

---
## 🛠️ Requirements
 🔹Java: 25
 🔹Spring Boot: 4.0.1
 🔹Spring Security
 🔹JWT (JSON Web Token)
 🔹MySQL Database
 🔹Maven

---
## :package: Dependencies
The following dependencies are required to run the project:
- 🔹Spring Boot Starter Web: For building web applications and RESTful services
- 🔹Spring Boot Starter Data JPA: For database interaction using JPA
- 🔹Spring Boot Starter Security: For implementing security features
- 🔹MySQL Connector/J: MySQL database driver
- 🔹Bcrypt Password Encoder: For secure password hashing
- 🔹Lombok: For reducing boilerplate code (Getters, Setters, Constructors)
- 🔹JWT: For user authentication using JSON Web Tokens

---
## :arrow_forward: How to Run the Project
Follow these steps to clone and run the project:
- 🔹1. Clone the Project

        Open your terminal and clone the repository:
        git clone https://github.com/JeffrySalim/User-Authentication-System.git
  
- 🔹2. Import Project into IDE

        Open the cloned project in your preferred IDE IntelliJ IDEA, etc.
 
- 🔹3. Set Up MySQL Database

        Open MySQL
        Create a new database with the following SQL query:
        CREATE DATABASE auth_db;
  
- 🔹4. Configure application.properties

       In the src/main/resources/application.properties file, configure the MySQL connection details:

       spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
       spring.datasource.username=root
       spring.datasource.password=yourpassword
       spring.jpa.hibernate.ddl-auto=update

       Replace "yourpassword" with the actual password for your MySQL database.
  
- 🔹5. Run the Application

       In the terminal or IDE, run the Spring Boot application:
       mvn spring-boot:run
       The application should now be running at http://localhost:8080.

---
## :bulb: Features

- JWT Authentication: Secure API access using JWT tokens.
- Password Hashing: User passwords are securely hashed with Bcrypt.
- Spring Security: For handling login and authorization.
- CRUD Operations: Basic endpoints to register, log in, and manage users.

---
## :computer: API Endpoints

- POST /api/auth/register: Register a new user
- POST /api/auth/login: Login and receive a JWT token
- GET /api/user: Get user details (requires authentication)

---
## :warning: Important Notes

Make sure you have MySQL running and the database is created.
You can test the API using tools like Postman or cURL.
You need to send the Authorization header with Bearer <JWT> for protected routes.

---
## :gear: Development Guide

- 🔹1. Preparation 

        Create Account Hub Docker -> Settings -> Security -> Personal Access Token
        Generate New Token -> Fill Access Token Desc & Expiration Date -> Access Permission Read & Write - Generate

- 🔹2. Configure SSH

        Github Project -> Setting -> Secret and Variables -> Actions -> New Repository Secret
        VPS_HOST = ${Host_Server}
        VPS_USER = ${User_Server}
        VPS_SSH_KEY = ${Ssh_Key}
        DOCKERHUB_USERNAME = ${Username_Dockerhub}
        DOCKERHUB_TOKEN = ${Token_Dockerhub}
  
- 🔹3. Add Remote  

        git remote add origin https://github.com/your-repo.git

- 🔹4. Create Dockerfile at root project  

        Copy Dockerfile to your Dockerfile

- 🔹5. Create docker-compose.yml at root project  

        Copy docker-compose.yml to your docker-compose.yml
        Set your service name, image name and container_name same with your docker vps

- 🔹6. Create file .github/workflows/deploy.yml at root project 

        Copy .github/workflows/deploy.yml to your .github/workflows/deploy.yml
        Set your IMAGE_NAME and APP_DIR same with your docker vps

- 🔹7. Set Up VPS

        Access your vps with terminal
        ssh user_vps@host_vps

        Enter to your folder and create file .env
        Fill your file .env with your need from your project and add APP_POST=${port}

- 🔹8. Commit your project to github at main branch 

- 🔹9. Check your CI/CD at tab Action on github

- 🔹10. To Access this project you can check with postman

        url : http://203.194.115.210:9001/api/auth/register
        Request Method : Post
        Content-Type : application/json
        language : json
        { "email" : "test@gmail.com", "password" : 123}
 
        url : http://203.194.115.210:9001/api/auth/login
        Request Method : Post
        Content-Type : application/json
        language : json
        { "email" : "test@gmail.com", "password" : 123}

        url : http://203.194.115.210:9001/api/user
        Request Method : Get
        
---
## :rocket: Contributing

Fork the project.
Create a new branch (git checkout -b feature/your-feature).
Commit your changes (git commit -m 'Add new feature').
Push to your branch (git push origin feature/your-feature).
Open a pull request to the main branch.

---
## :handshake: License
This project is licensed under the MIT License.
This improved version of your README is now structured with clearer headings, step-by-step instructions, and better formatting, making it easier for users to understand how to set up, run, and contribute to the project.
