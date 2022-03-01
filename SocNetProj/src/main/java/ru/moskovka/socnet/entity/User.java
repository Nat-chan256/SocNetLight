package ru.moskovka.socnet.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "User")
public class User {
    @Id
    private String login;

    @Column
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @Column
    @NotEmpty(message = "Surname should not be empty")
    private String surname;

    @Column
    private String password;

    @Transient
    private String confirmPassword;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
