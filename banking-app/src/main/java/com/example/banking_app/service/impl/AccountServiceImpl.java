package com.example.banking_app.service.impl;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;
import com.example.banking_app.dto.AccountDto;
import com.example.banking_app.entity.Account;
import com.example.banking_app.reposiotry.AccountRepository;
import com.example.banking_app.service.AccountService;
import com.example.banking_app.mapper.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {

        this.accountRepository = accountRepository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {

        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
       return AccountMapper.mapToAccountDto(savedAccount);

    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map(AccountMapper::mapToAccountDto).collect(Collectors.toList());
}

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("Account not found"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deleteAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        //delete the account from the   accountRepository
        accountRepository.deleteById(id);
        //return the deleted account
        return AccountMapper.mapToAccountDto(account);

    }


}
