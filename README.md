User Authentication System

A backend Spring Boot application that implements user authentication using JWT (JSON Web Tokens) for secure API access and Bcrypt for password hashing.

 Project Overview

This project provides a simple User Authentication System that allows users to register, log in, and authenticate using JWT. It leverages Spring Boot for easy setup and includes Spring Security to manage authentication and authorization. The passwords are securely hashed using Bcrypt and stored in a MySQL database.

:checkered_flag: Requirements

Java: 25

Spring Boot: 4.0.1

Spring Security

JWT (JSON Web Token)

MySQL: For storing user credentials

Maven: For dependency management

:package: Dependencies

The following dependencies are required to run the project:

Spring Boot Starter Web: For building web applications and RESTful services

Spring Boot Starter Data JPA: For database interaction using JPA

Spring Boot Starter Security: For implementing security features

MySQL Connector/J: MySQL database driver

Bcrypt Password Encoder: For secure password hashing

Lombok: For reducing boilerplate code (Getters, Setters, Constructors)

JWT: For user authentication using JSON Web Tokens

:arrow_forward: How to Run the Project

Follow these steps to clone and run the project:

1. Clone the Project

Open your terminal and clone the repository:

git clone https://github.com/JeffrySalim/User-Authentication-System.git

2. Import Project into IDE

Open the cloned project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, etc.).

3. Set Up MySQL Database

Start MySQL (locally or via a container).

Create a new database with the following SQL query:

CREATE DATABASE auth_db;

4. Configure application.properties

In the src/main/resources/application.properties file, configure the MySQL connection details:

spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


Replace "yourpassword" with the actual password for your MySQL database.

5. Run the Application

In the terminal or IDE, run the Spring Boot application:

mvn spring-boot:run


The application should now be running at http://localhost:8080.

:bulb: Features

JWT Authentication: Secure API access using JWT tokens.

Password Hashing: User passwords are securely hashed with Bcrypt.

Spring Security: For handling login and authorization.

CRUD Operations: Basic endpoints to register, log in, and manage users.

:computer: API Endpoints

POST /api/auth/register: Register a new user

POST /api/auth/login: Login and receive a JWT token

GET /api/user: Get user details (requires authentication)

:warning: Important Notes

Make sure you have MySQL running and the database is created.

You can test the API using tools like Postman or cURL.

You need to send the Authorization header with Bearer <JWT> for protected routes.

:gear: Development Notes

This project uses:

Spring Boot 4.0.1 (latest stable version)

MySQL for data persistence

JWT for handling secure authentication tokens

Bcrypt Password Encoder to securely hash user passwords

To add more features, such as refresh tokens or OAuth integration, feel free to open an issue or contribute to the project!

:rocket: Contributing

Fork the project.

Create a new branch (git checkout -b feature/your-feature).

Commit your changes (git commit -m 'Add new feature').

Push to your branch (git push origin feature/your-feature).

Open a pull request to the main branch.

:handshake: License

This project is licensed under the MIT License.

This improved version of your README is now structured with clearer headings, step-by-step instructions, and better formatting, making it easier for users to understand how to set up, run, and contribute to the project.
