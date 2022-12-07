package com.renton.application.controller;

import com.renton.application.model.OrderItem;
import com.renton.application.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(OrderController.BASE_URL)
public class OrderItemController {
    public static final String BASE_URL = "/api/v1/orders";
    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }
    @PostMapping()
    @RequestMapping(value = "/{id}/saveItemTest", method = RequestMethod.POST)
    public void saveTest(@RequestBody OrderItem orderItem, @PathVariable int id){
        orderItemService.save(orderItem, Long.parseLong(String.valueOf(id)));
    }
}
