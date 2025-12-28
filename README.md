Project : User Authentication System

Backend Spring Boot Project using password hashing by Bcrypt password encoder and authentication JWT

REQUIREMENT :
- Java 25
- Spring Boot 4.0.1
- Spring Security
- JWT (JSON Web Token)
- MYSQL
- Maven

DEPENDENCIES :
- SPRING BOOT STARTER WEB
- SPRING BOOT STARTER DATA JPA
- SPRING BOOT STARTER SECURITY
- MYSQL CONNECTOR J
- BCRYPT PASSWORD ENCODER
- LOMBOK
- JWT
- 
RUN : 
- Clone Project : 
  git clone https://github.com/JeffrySalim/User-Authentication-System.git
- Import Project to IDE
- Run MySQL and create new database :
  CREATE DATABASE auth_db
- Settings application.properties
  spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
  spring.datasource.username= "root"
  spring.datasource.password= "yourpassword"
- Run Application
  mvn spring-boot:run




