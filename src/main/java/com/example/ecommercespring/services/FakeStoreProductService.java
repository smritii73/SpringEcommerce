package com.example.ecommercespring.services;

import com.example.ecommercespring.dto.ProductDTO;

import java.io.IOException;

public class FakeStoreProductService implements IProductService{

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        return null;
    }
}
