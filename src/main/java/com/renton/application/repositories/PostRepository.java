package com.renton.application.repositories;

import com.renton.application.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, Long> {
    @Query("{name:'?0'}")
    Post findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Post> findAll(String category);

    List<Post> findAll();

    public long count();
}
