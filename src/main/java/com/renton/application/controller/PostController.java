package com.renton.application.controller;

import com.renton.application.model.Post;
import com.renton.application.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PostController.BASE_URL)
public class PostController {
    public static final String BASE_URL = "/api/v1/posts";
//    private final PostService postService;
//
//    public PostController(PostService postService) {
//        this.postService = postService;
//    }
//
//    @GetMapping
//    public List<Post> getAll(){
//        return postService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Post getById(@PathVariable Long id){
//        return postService.findById(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Post save(@RequestBody Post post){
//        return postService.save(post);
//    }
}
