package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.ProductDTO;

import java.io.IOException;

public class FakeStoreProductGateway implements IProductGateway{

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        return null;
    }
}
