package br.edu.ifba.myblog.controllers;

import br.edu.ifba.myblog.models.dto.UserDto;
import br.edu.ifba.myblog.models.entities.User;
import br.edu.ifba.myblog.repositories.UsersRepository;

import java.net.URI;
import java.util.List;

import br.edu.ifba.myblog.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }

    @PostMapping
    public ResponseEntity<List<UserDto>> registerUsers(@RequestBody List<UserDto> userDtoList) {

        if (userService.registerUsers(userDtoList)) {
            URI location = URI.create("/posts/{id}");
            return ResponseEntity.created(location).build();
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {
        List<UserDto> users = userService.getUsers();

        if (users.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable long id) {

        UserDto userDto = userService.getUser(id);

        if (userDto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(userDto);
    }
}