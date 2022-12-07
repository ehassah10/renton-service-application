package com.renton.application.bootstrap;

import com.renton.application.model.*;
import com.renton.application.repositories.ItemRepository;
import com.renton.application.repositories.OrderRepository;
import com.renton.application.repositories.UserRepository;
import com.renton.application.service.implementation.SequenceGeneratorService;
import com.renton.application.utils.Enum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication implements CommandLineRunner {

    @Autowired
    OrderRepository orderRepository;
    public static void main(String[] args) {
        SpringApplication.run(MdbSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createItems();
    }
    void createItems() {
        System.out.println("Data creation started...");
        OrderItem orderItem = new OrderItem(1,2,"name","ddf",2,4.3, Enum.orderItemStatus.New);
        List<OrderItem> olist = new ArrayList<>();
        olist.add(orderItem);
        Order order = new Order(2,2,2, olist,3.4, Enum.orderStatus.New, new Date(), new Date());
        orderRepository.save(order);
        System.out.println("Data creation complete...");

    }
}
