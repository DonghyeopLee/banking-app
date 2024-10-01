package com.example.banking_app.service;

import java.util.List;

import com.example.banking_app.dto.AccountDto;;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    List<AccountDto> getAllAccounts();
}
