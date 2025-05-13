package br.edu.ifba.myblog.services;

import br.edu.ifba.myblog.models.dto.UserDto;
import br.edu.ifba.myblog.models.entities.User;
import br.edu.ifba.myblog.repositories.UsersRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Transactional
public class UserService {

    private final UsersRepository usersRepository;

    public UserService(UsersRepository postsRepository) {
        this.usersRepository = postsRepository;
    }

    public UserDto getUser(long id) {

        if (usersRepository.findById(id).isPresent()) {
            User user = usersRepository.findById(id).get();
            return new UserDto(user.getName(), user.getLogin(), user.getPassword());
        }

        return null;
    }

    public List<UserDto> getUsers() {

        List<User> users = usersRepository.findAll();

        return users.stream()
                .map(user -> new UserDto(user.getName(), user.getLogin(), user.getPassword()))
                .toList();
    }

    public boolean registerUsers(List<UserDto> userDtoList) {

        List<User> newUsers = userDtoList.stream()
                .map(User::new)
                .toList();

        usersRepository.saveAll(newUsers);

        return true;
    }

//    Business logic layer
//    insert
//    list
//    update
//    delete
}