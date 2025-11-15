package com.javacart.controller;

import com.javacart.model.Product;
import com.javacart.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> all(@RequestParam(required = false) String category) {
        if (category == null || category.isEmpty()) return repo.findAll();
        return repo.findByCategory(category);
    }
}
