package com.example.ecommercespring.services;

import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.gateway.FakeStoreProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class FakeStoreProductService implements IProductService{
    private final FakeStoreProductGateway fakeStoreProductGateway;

    public FakeStoreProductService(FakeStoreProductGateway fakeStoreProductGateway) {
        this.fakeStoreProductGateway = fakeStoreProductGateway;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        ProductDTO response = this.fakeStoreProductGateway.getProductById(id);
        return response;
    }
}
