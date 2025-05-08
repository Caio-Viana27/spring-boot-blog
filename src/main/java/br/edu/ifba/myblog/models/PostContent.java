package br.edu.ifba.myblog.models;

public class PostContent {
    private String content;

    public PostContent() {}

    public PostContent(String textContent) {
        this.content = textContent;
    }

    public void setContent(String textContent) {
        this.content = textContent;
    }
}