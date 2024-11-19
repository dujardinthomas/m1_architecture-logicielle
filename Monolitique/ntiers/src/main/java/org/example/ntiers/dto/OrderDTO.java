package org.example.ntiers.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private Long id;
    private String orderNumber;
    private String formattedOrderDate;
    private Long productId;
    private ProductDTO product;
}
