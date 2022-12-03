package com.renton.application.service;

import com.renton.application.model.Item;

import java.util.List;

public interface ItemService {
    Item findById(Long id);
    List<Item> findAll();
    Item save(Item customer);
}
