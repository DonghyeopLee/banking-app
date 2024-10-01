package com.example.banking_app.dto;
 
import lombok.Data;
import lombok.AllArgsConstructor;



@Data
@AllArgsConstructor
public class AccountDto {
    private long id; 
    private String accountHolderName;
    private double balance;


}
