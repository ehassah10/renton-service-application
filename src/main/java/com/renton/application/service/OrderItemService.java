package com.renton.application.service;

import com.renton.application.model.OrderItem;

import java.util.List;

public interface OrderItemService {
    OrderItem findById(Long id);
    List<OrderItem> findAll();
    void save(OrderItem orderITem, Long orderId);
    void delete(Long id);
}
