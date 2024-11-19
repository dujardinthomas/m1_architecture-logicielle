package org.example.ntiers.utils;

import org.example.ntiers.dto.OrderDTO;
import org.example.ntiers.dto.ProductDTO;
import org.example.ntiers.model.Order;
import org.example.ntiers.model.Product;
import org.springframework.stereotype.Component;

@Component
public class DTOMapper {

    public static ProductDTO toProductDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }

    public static Product toProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return product;
    }

    public static OrderDTO toOrderDTO(Order order){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setOrderNumber(order.getOrderName());
        orderDTO.setFormattedOrderDate(order.getOrderDate().toString());
        orderDTO.setProductId(order.getProduct().getId());

        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(order.getProduct().getId());
        productDTO.setName(order.getProduct().getName());
        productDTO.setPrice(order.getProduct().getPrice());
        orderDTO.setProduct(productDTO);
        return orderDTO;
    }

    public static Order toOrder(OrderDTO orderDTO, Product product){
        Order order = new Order();
        order.setId(order.getId());
        order.setOrderName(orderDTO.getOrderNumber());
        return null;
    }






}
