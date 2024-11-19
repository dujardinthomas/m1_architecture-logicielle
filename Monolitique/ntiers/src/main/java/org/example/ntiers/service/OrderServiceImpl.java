package org.example.ntiers.service;

import org.example.ntiers.dto.OrderDTO;
import org.example.ntiers.exception.ResourceNotFoundException;
import org.example.ntiers.model.Order;
import org.example.ntiers.model.Product;
import org.example.ntiers.repository.OrderRepository;
import org.example.ntiers.utils.DTOMapper;

import java.time.LocalDate;
import java.util.List;


public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final ProductService productService;

    public OrderServiceImpl(OrderRepository orderRepository, ProductService productService) {
        this.orderRepository = orderRepository;
        this.productService = productService;
    }


    @Override
    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().
                stream().
                map(DTOMapper::toOrderDTO)
                .toList();
    }

    @Override
    public List<OrderDTO> getAllOrder() {
        return null;
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Order Not Found"));
        return DTOMapper.toOrderDTO(order);
    }

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        Product product = DTOMapper.toProduct(productService.getProductById(orderDTO.getProductId()));
        Order order = DTOMapper.toOrder(orderDTO, product);
        return DTOMapper.toOrderDTO(orderRepository.save(order));
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        Order order = orderRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Order Not Found"));
        order.setOrderNumber(orderDTO.getOrderNumber());
        order.setOrderDate(LocalDate.parse(orderDTO.getFormattedOrderDate()));
        Product product = DTOMapper.toProduct(productService.getProductById(orderDTO.getProductId()));
        order.setProduct(product);
        return DTOMapper.toOrderDTO(orderRepository.save(order));
    }

    @Override
    public void deleteOrder(Long id) {
        Order order = orderRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Order Not Found"));
        orderRepository.delete(order);
    }
}