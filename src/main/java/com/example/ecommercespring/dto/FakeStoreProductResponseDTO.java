package com.example.ecommercespring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreProductResponseDTO {
	private ProductDTO product;
	private String message;
	private String status;
}