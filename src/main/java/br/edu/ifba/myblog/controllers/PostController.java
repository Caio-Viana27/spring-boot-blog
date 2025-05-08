package br.edu.ifba.myblog.controllers;

import br.edu.ifba.myblog.models.entities.Post;
import br.edu.ifba.myblog.repositories.PostsRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostsRepository postsRepository;

    @GetMapping
    public List<Post> ListPosts() {
        return null;
    }
}