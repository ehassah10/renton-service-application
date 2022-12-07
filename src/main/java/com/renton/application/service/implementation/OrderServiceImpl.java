package com.renton.application.service.implementation;

import com.renton.application.model.Order;
import com.renton.application.model.OrderItem;
import com.renton.application.repositories.OrderRepository;
import com.renton.application.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final SequenceGeneratorService sequenceGeneratorService;
    @Autowired
    protected MongoTemplate mongoTemplate;

    public OrderServiceImpl(OrderRepository orderRepository, SequenceGeneratorService sequenceGeneratorService) {
        this.orderRepository = orderRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order saveItem(Order order) {
        order.setId(sequenceGeneratorService.generateSequence(order.SEQUENCE_NAME));
        return orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void saveItem(OrderItem orderItem, Long orderId) {
        Order order = this.findById(orderId);
        orderItem.setId(sequenceGeneratorService.generateSequence(orderItem.SEQUENCE_NAME));
        order.orderItems.add(orderItem);
        mongoTemplate.save(order);
    }
}