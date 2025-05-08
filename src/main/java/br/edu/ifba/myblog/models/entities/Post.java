package br.edu.ifba.myblog.models.entities;

import br.edu.ifba.myblog.models.Category;
import br.edu.ifba.myblog.models.Title;
import br.edu.ifba.myblog.models.PostContent;

import jakarta.persistence.*;

@Entity(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;

    @Embedded
    private Title title;
    @Embedded
    private PostContent content;

    @Enumerated(EnumType.STRING)
    private Category category;

    public Post() {}

    public Post(Title title, PostContent content, User user, Category category) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.category = category;
    }
}