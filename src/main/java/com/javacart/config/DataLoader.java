package com.javacart.config;

import com.javacart.model.Product;
import com.javacart.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner init(ProductRepository repo) {
        return args -> {
            repo.save(new Product("Coffee Maker", "Home", 79.99, 20, ""));
            repo.save(new Product("Desk Lamp", "Home", 39.99, 35, ""));
            repo.save(new Product("Wireless Headphones", "Electronics", 129.99, 15, ""));
        };
    }
}
