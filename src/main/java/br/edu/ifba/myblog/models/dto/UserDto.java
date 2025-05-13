package br.edu.ifba.myblog.models.dto;

import br.edu.ifba.myblog.models.Name;
import br.edu.ifba.myblog.models.Login;
import br.edu.ifba.myblog.models.Password;

public record UserDto(Name name, Login login, Password password) {

    public UserDto(Name name, Login login, Password password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
}