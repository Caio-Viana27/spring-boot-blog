package br.edu.ifba.myblog.models.entities;

import br.edu.ifba.myblog.models.Name;
import br.edu.ifba.myblog.models.Login;
import br.edu.ifba.myblog.models.Password;

import br.edu.ifba.myblog.models.dto.UserDto;
import jakarta.persistence.*;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private Name name;
    @Embedded
    private Login login;
    @Embedded
    private Password password;

    public User() {}

    public User(Name name, Login login, Password password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public User(UserDto userDto) {
        name = userDto.name();
        login = userDto.login();
        password = userDto.password();
    }

    public long getId() {
        return id;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Name getName() {
        return name;
    }

    public Login getLogin() {
        return login;
    }

    public Password getPassword() {
        return password;
    }
}