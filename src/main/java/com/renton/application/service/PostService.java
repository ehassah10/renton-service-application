package com.renton.application.service;

import com.renton.application.model.Post;

import java.util.List;

public interface PostService {
    Post findById(Long id);
    List<Post> findAll();
    Post save(Post customer);
}
