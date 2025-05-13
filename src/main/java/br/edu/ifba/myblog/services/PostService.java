package br.edu.ifba.myblog.services;

import br.edu.ifba.myblog.repositories.PostsRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PostService {

    private final PostsRepository postsRepository;

    public PostService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

//    Business logic layer
//    insert
//    list
//    update
//    delete
}