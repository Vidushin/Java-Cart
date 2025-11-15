Java-Cart – Spring Boot E-Commerce Backend

Java-Cart is a simple e-commerce backend built using Spring Boot, Spring Data JPA, and an in-memory H2 database. It provides REST APIs for listing products and managing a shopping cart.

Features

List available products

Add items to cart

View cart with totals

Stock validation

Auto-loaded sample products (H2 DB)

Clean layered architecture (Controller → Service → Repository)

Tech Stack

Java 17

Spring Boot 3

Spring Web

Spring Data JPA

H2 Database

Maven

Run the Project
mvn spring-boot:run


App runs at:

http://localhost:8080


H2 Database Console:

http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:javacartdb

API Endpoints
Get all products
GET /api/products

Add item to cart
POST /api/cart/add


Body:

{
  "productId": 1,
  "quantity": 2
}

View cart
GET /api/cart

Purpose

Built as a portfolio project to demonstrate:

REST API development

Backend architecture

Spring Boot and JPA fundamentals
