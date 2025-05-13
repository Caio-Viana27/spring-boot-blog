package br.edu.ifba.myblog.models.dto;

import br.edu.ifba.myblog.models.*;
import br.edu.ifba.myblog.models.entities.User;

public record PostDto(User owner, Title title, PostContent content, Category category) {

    public PostDto(User owner, Title title, PostContent content, Category category) {
        this.owner = owner;
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
