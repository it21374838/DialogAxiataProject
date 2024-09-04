package com.example.DialogProject.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.DialogProject.Model.Account;

@Service
public class AccountService {
    private Map<String, Account> accountMap = new HashMap<>();

    // Create a new account
    public Account createAccount(String accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accountMap.put(accountNumber, account);
        
        // Debug log to print account details
        System.out.println("Account created: " + accountNumber + " with balance: " + initialBalance);
        printAllAccounts(); // Print the state of accountMap after creation
        
        return account;
    }

    // Retrieve an existing account by account number
    public Account getAccount(String accountNumber) {
        return accountMap.get(accountNumber);
    }

    // Method to print all accounts in the accountMap
    private void printAllAccounts() {
        System.out.println("Current accounts in the system:");
        for (Map.Entry<String, Account> entry : accountMap.entrySet()) {
            System.out.println("Account Number: " + entry.getKey() + ", Balance: " + entry.getValue().getBalance());
        }
    }
}
