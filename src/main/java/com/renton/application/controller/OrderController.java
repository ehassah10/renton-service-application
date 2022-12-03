package com.renton.application.controller;

import com.renton.application.model.Order;
import com.renton.application.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(OrderController.BASE_URL)
public class OrderController {
    public static final String BASE_URL = "/api/v1/Orders";
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAll(){
        List<Order> order = orderService.findAll();
        return order;
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id){
        return orderService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Order save(@RequestBody Order Order){
        return orderService.save(Order);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id){
        orderService.delete(id);
    }
}
