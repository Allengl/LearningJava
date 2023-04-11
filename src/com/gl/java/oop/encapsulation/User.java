package com.gl.java.oop.encapsulation;

public class User {

    private String username;

    private String password;

    private boolean login;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void  login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("Login successfully");
            this.login = true;
        } else {
            System.out.println("Login failed");
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}
