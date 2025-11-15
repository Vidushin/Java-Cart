package com.javacart.service;

import com.javacart.model.Product;
import com.javacart.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartService {
    private final ProductRepository productRepository;
    // simple in-memory cart per application (for demo only)
    private final Map<Long, Integer> items = new LinkedHashMap<>();

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public synchronized void addToCart(Long productId, int quantity) {
        items.put(productId, items.getOrDefault(productId, 0) + quantity);
    }

    public synchronized Map<Product, Integer> getCart() {
        Map<Product, Integer> out = new LinkedHashMap<>();
        for (Map.Entry<Long, Integer> e : items.entrySet()) {
            productRepository.findById(e.getKey()).ifPresent(p -> out.put(p, e.getValue()));
        }
        return out;
    }

    public synchronized void clear() {
        items.clear();
    }
}
