package com.renton.application;

import com.renton.application.repositories.PostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = PostRepository.class)
@SpringBootApplication
public class RentonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentonApplication.class, args);
	}

}
