package br.edu.ifba.myblog.models;

public class Name {
    private String name;

    public Name() {}

    public Name(String text) {
        this.name = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}