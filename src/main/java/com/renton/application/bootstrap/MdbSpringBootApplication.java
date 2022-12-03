package com.renton.application.bootstrap;

import com.renton.application.model.*;
import com.renton.application.repositories.ItemRepository;
import com.renton.application.repositories.UserRepository;
import com.renton.application.utils.Enum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(MdbSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createItems();
    }
    void createItems() {
        System.out.println("Data creation started...");

        System.out.println("Data creation complete...");

    }
}
