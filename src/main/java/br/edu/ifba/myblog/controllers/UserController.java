package br.edu.ifba.myblog.controllers;

import br.edu.ifba.myblog.models.entities.User;
import br.edu.ifba.myblog.repositories.UsersRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UsersRepository repository;

    public UserController(UsersRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = repository.findAll();

        if (users.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable long id) {

        if (repository.findById(id).isPresent()) {
            return ResponseEntity.ok(repository.findById(id).get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        //User createdPost = userService.create(dto);
        //URI location = URI.create("/posts/" + createdPost.getId());
        repository.save(user);

        return ResponseEntity.status(201).build();
    }
}