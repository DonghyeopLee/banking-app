package com.example.banking_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.banking_app.entity.Account;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		Account newAccount = new Account();
		newAccount.setAccountHolderName("John Doe");
		newAccount.setBalance(1000.0);
		SpringApplication.run(BankingAppApplication.class, args);
	}

}

