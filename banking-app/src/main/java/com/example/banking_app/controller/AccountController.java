package com.example.banking_app.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.banking_app.exception.InvalidAccountException;
import com.example.banking_app.dto.AccountDto;
import com.example.banking_app.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> addAccont(AccountDto accountDto){
        if (accountDto.getBalance() < 0) {
            throw new InvalidAccountException("Account balance cannot be negative");
        }
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);

    }
    @ExceptionHandler(InvalidAccountException.class)
    public ResponseEntity<String> handleInvalidAccountException(InvalidAccountException e) {
        return new ResponseEntity<>("Invalid account details: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }


}
