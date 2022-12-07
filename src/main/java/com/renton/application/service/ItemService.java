package com.renton.application.service;

import com.renton.application.model.Item;
import com.renton.application.model.User;

import java.util.List;

public interface ItemService {
    Item findById(Long id);
    List<Item> findAll();
    Item save(Item item);
    void delete(Long id);
}
