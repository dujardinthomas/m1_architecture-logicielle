package org.example.ntiers.service;

import org.example.ntiers.dto.OrderDTO;

import java.security.Key;
import java.util.List;

public interface OrderService {

    List<OrderDTO> getAllOrder();
    OrderDTO getOrderById(Long id);
    OrderDTO saveOrder(OrderDTO orderDTO);
    OrderDTO updateOrder(Long id, OrderDTO orderDTO);
    void deleteOrder(Long id);

}
