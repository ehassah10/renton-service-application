package com.renton.application.repositories;

import com.renton.application.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<Item, Long> {

    @Query("{name:'?0'}")
    Item findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Item> findAll(String category);

    public long count();

}
