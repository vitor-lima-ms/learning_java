package com.productsapi.productsAPI.controller;

import com.productsapi.productsAPI.model.Product;
import com.productsapi.productsAPI.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        String id;
        id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        return product;
    }

    @GetMapping("/details/{id}")
    public Product detailsProduct(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }
}

