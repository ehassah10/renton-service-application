package com.renton.application.controller;

import com.renton.application.model.Item;
import com.renton.application.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PostController.BASE_URL)
public class ItemController {
//    public static final String BASE_URL = "/api/v1/posts";
//    private final ItemService itemService;
//
//    public ItemController(ItemService itemService) {
//        this.itemService = itemService;
//    }
//
//    @GetMapping
//    public List<Item> getAll(){
//        return itemService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Item getById(@PathVariable Long id){
//        return itemService.findById(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Item save(@RequestBody Item item){
//        return itemService.save(item);
//    }
}
