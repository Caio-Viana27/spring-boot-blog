package br.edu.ifba.myblog.models;

public class Login {
    private String login;

    public Login() {}

    public Login(String text) {
        this.login = text;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}