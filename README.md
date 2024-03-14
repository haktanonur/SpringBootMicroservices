# Spring Boot Microservices

This project is a microservices project that includes microservices patterns and Spring Cloud.

## Features

- Microservices Communication using **Spring Cloud OpenFeign**

- Create Service Registry and Discovery using **Spring Cloud Netflix Eureka**

- Load balancing with **Eureka** server and **Open Feign** using **Spring Cloud LoadBalancer**

- Create API Gateway using **Spring Cloud Gateway**

- Centralized Configurations using **Spring Cloud Config Server**

- Auto Refresh Config Changes using **Spring Cloud Bus**

- Distributed Tracing using **Micrometer** 

- Using **Zipkin** to Visualize Trace Information

- Resilience4J: **Circuit Breaker**, **Retry**, and **RateLimiter** Patterns

## Tools and Technologies

Java 17+, Spring Boot 3, Spring Cloud, Maven, Docker, RabbitMQ, MySQL, Postman, IntelliJ IDEA

## How to run the application
1 - Install Docker on your computer if not already installed.

2 - Open Terminal or Command Prompt and run the following command to start Zipkin:

```
docker run --rm -it --name zipkin -p 9411:9411 openzipkin/zipkin
```

3- Run the following command to start RabbitMQ:
```
docker run --rm -it -p 5672:5672 rabbitmq:3.11.0
```

4- Create the databases

Configure to your database settings from application.properties file and Connect MySQL client and create a new database:
```
CREATE DATABASE department_db;
CREATE DATABASE employee_db;
CREATE DATABASE organization_db;
```
5- Run the services

- Run ```mvn clean verify -DskipTests``` by going inside each folder to build the applications.

- After that run ```mvn spring-boot:run``` by going inside each folder to start the applications.

## Microservices Architecture


![Screenshot 2024-03-15 002214](https://github.com/haktanonur/SpringBootMicroservices/assets/69698425/df27d6ba-bf86-4312-abb1-3b1e07aebcb0)
