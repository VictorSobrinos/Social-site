package com.SocialSite.mainService.controller.impl;

import com.SocialSite.mainService.model.Post;
import com.SocialSite.mainService.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    public PostRepository postRepository;

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody Post post){
        postRepository.save(post);
    }

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> getUsers(){
        List<Post> posts;
        posts = postRepository.findAll();
        return posts;
    }
}
