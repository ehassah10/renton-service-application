package com.renton.application.repositories;

import com.renton.application.model.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderItemRepository extends MongoRepository<OrderItem, Long> {
}
