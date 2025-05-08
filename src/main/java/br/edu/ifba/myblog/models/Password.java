package br.edu.ifba.myblog.models;

public class Password {
    private String password;

    public Password() {}

    public Password(String text) {
        this.password = text;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}