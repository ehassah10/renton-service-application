package com.renton.application.repositories;

import com.renton.application.model.Order;
import com.renton.application.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, Long> {
    @Query("{name:'?0'}")
    User findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<User> findAll(String category);

    public long count();
}
