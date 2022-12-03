package com.renton.application.service;

import com.renton.application.model.Order;

import java.util.List;

public interface OrderService {
    Order findById(Long id);
    List<Order> findAll();
    Order save(Order order);
    void delete(Long id);
}
