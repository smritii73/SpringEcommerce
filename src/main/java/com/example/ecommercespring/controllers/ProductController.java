package com.example.ecommercespring.controllers;

import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.services.FakeStoreProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final FakeStoreProductService fakeStoreProductService;
    public ProductController(FakeStoreProductService fakeStoreProductService) {
        this.fakeStoreProductService = fakeStoreProductService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws IOException {
        ProductDTO response = this.fakeStoreProductService.getProductById(id);
        return ResponseEntity.ok(response);
    }
}