package com.example.banking_app.dto;
 
import lombok.Data;
import lombok.AllArgsConstructor;



@Data
@AllArgsConstructor
public class AccountDto {
    private Long id; 
    private String accountHolderNumber;
    private Double balance;


}
