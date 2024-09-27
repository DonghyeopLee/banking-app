package com.example.banking_app.service.impl;

import org.springframework.stereotype.Service;

import com.example.banking_app.dto.AccountDto;
import com.example.banking_app.reposiotry.AccountRepository;
import com.example.banking_app.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }



    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        // TODO Auto-generated method stub
       return null;

}
