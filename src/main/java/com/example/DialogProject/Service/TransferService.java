package com.example.DialogProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DialogProject.Model.Account;

@Service
public class TransferService {
    @Autowired
    private AccountService accountService;

    public TransferService(AccountService accountService2) {
        
    }

    public String transferFunds(String sourceAccountNumber, String destinationAccountNumber, double amount) {
        // Debug logs to track the process
        System.out.println("Initiating transfer...");
        System.out.println("Source Account: " + sourceAccountNumber);
        System.out.println("Destination Account: " + destinationAccountNumber);
        System.out.println("Amount: " + amount);

        Account source = accountService.getAccount(sourceAccountNumber);
        if (source == null) {
            System.out.println("Error: Source account not found!");
            throw new IllegalArgumentException("Source account not found");
        }
        
        Account destination = accountService.getAccount(destinationAccountNumber);
        if (destination == null) {
            System.out.println("Error: Destination account not found!");
            throw new IllegalArgumentException("Destination account not found");
        }

        if (source.getBalance() < amount) {
            System.out.println("Error: Insufficient funds!");
            throw new IllegalArgumentException("Insufficient funds");
        }

        // Perform the transfer
        source.setBalance(source.getBalance() - amount);
        destination.setBalance(destination.getBalance() + amount);
        System.out.println("Transfer successful. New balances - Source: " + source.getBalance() + ", Destination: " + destination.getBalance());

        return "Transfer successful";
    }
}
