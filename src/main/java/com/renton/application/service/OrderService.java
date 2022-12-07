package com.renton.application.service;

import com.renton.application.model.Order;
import com.renton.application.model.OrderItem;

import java.util.List;

public interface OrderService {
    Order findById(Long id);
    List<Order> findAll();
    Order saveItem(Order order);
    void delete(Long id);
    void saveItem(OrderItem orderITem, Long orderId);
}
