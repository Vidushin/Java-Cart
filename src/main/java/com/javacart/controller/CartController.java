package com.javacart.controller;

import com.javacart.model.Product;
import com.javacart.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody AddRequest req) {
        cartService.addToCart(req.productId, req.quantity);
        return ResponseEntity.ok("added");
    }

    @GetMapping
    public Map<Product, Integer> get() {
        return cartService.getCart();
    }

    @PostMapping("/clear")
    public ResponseEntity<String> clear() {
        cartService.clear();
        return ResponseEntity.ok("cleared");
    }

    public static class AddRequest {
        public Long productId;
        public Integer quantity;
    }
}
