package com.example.phamt.bcex0129.model;

/**
 * Created by phamt on 2018/01/29.
 */

public class User {
    private String id;
    private String mail;
    private String password;

    public User(String id, String mail, String password) {
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
