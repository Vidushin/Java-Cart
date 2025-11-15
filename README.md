# JavaCart - Spring Boot (Minimal)

This is a minimal Spring Boot project that implements a tiny e-commerce backend with:
- Product entity and repository
- Cart service (in-memory)
- REST endpoints for products and cart

## Run locally
1. Install Java 17+ and Maven
2. Build & run:
```
mvn spring-boot:run
```
3. Open API endpoints:
- GET http://localhost:8080/api/products
- POST http://localhost:8080/api/cart/add  (body: { "productId": 1, "quantity": 2 })
- GET http://localhost:8080/api/cart

## Deploy
- Push this repo to GitHub and open in GitHub Codespaces or run on any Java-supporting host.
