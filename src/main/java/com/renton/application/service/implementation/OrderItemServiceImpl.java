package com.renton.application.service.implementation;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.result.UpdateResult;
import com.renton.application.model.OrderItem;
import com.renton.application.repositories.OrderItemRepository;
import com.renton.application.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItemServiceImpl implements OrderItemService {
    private final OrderItemRepository orderItemRepository;
    @Autowired
    protected MongoTemplate mongoTemplate;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem findById(Long id) {
        return orderItemRepository.findById(id).get();
    }

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public void save(OrderItem orderItem, Long orderId) {

        mongoTemplate.save(orderItem);
    }

    @Override
    public void delete(Long id) {

    }
}
