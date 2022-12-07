package com.renton.application.controller;

import com.renton.application.model.Order;
import com.renton.application.model.OrderItem;
import com.renton.application.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(OrderController.BASE_URL)
public class OrderController {
    public static final String BASE_URL = "/api/v1/orders";
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
    public Order save(@RequestBody Order order){
        return orderService.saveItem(order);
    }

    @PutMapping()
    @RequestMapping(value = "/{id}/saveItem", method = RequestMethod.PUT)
    public void saveItem(@RequestBody OrderItem orderItem, @PathVariable int id){
        orderService.saveItem(orderItem, Long.parseLong(String.valueOf(id)));
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id){
        orderService.delete(id);
    }
}
