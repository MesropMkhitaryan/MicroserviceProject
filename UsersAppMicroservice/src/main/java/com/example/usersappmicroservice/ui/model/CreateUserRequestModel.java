package com.example.usersappmicroservice.ui.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateUserRequestModel {

    @NotNull(message = "name can't be null")
    @Size(min = 2, message = "name can't be less than 2 characters")
    String firstName;
    @NotNull(message = "surname can't be null")
    @Size(min = 2, message = "surname can't be less than 2 characters")
    String lastName;
    @NotNull(message = "password can't be null")
    @Size(min = 8, max = 16, message = "surname can't be less than 2 characters")
    String password;
    @NotNull(message = "password can't be null")
    @Email
    String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
