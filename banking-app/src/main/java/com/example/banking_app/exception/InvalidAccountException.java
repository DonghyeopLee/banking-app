package com.example.banking_app.exception;

public class InvalidAccountException extends RuntimeException{
    public InvalidAccountException(String message) {
        super(message);
    }
}
