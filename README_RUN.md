# Run steps (short)
1. Open this repo in GitHub Codespaces or clone locally.
2. In terminal: `mvn spring-boot:run`
3. App runs on port 8080. Use endpoints:
   - GET /api/products
   - POST /api/cart/add  (JSON: {"productId":1,"quantity":2})
   - GET /api/cart
