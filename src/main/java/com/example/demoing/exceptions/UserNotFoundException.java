package com.example.demoing.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Not able to find user " + id);
    }
}
