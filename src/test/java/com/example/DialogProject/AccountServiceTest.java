package com.example.DialogProject;

import com.example.DialogProject.Model.Account;
import com.example.DialogProject.Service.AccountService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceTest {

    private AccountService accountService;

    @BeforeEach
    public void setup() {
        accountService = new AccountService();  // Initialize the service
    }

    @Test
    public void testCreateAccount() {
        Account account = accountService.createAccount("1001", 500.00);
        assertNotNull(account);  // Checking wheather if the account was created
        assertEquals("1001", account.getAccountNumber());  // Verify the account number
        assertEquals(500.00, account.getBalance(), 0.001);  // Verify the balance
    }

    @Test
    public void testGetAccount() {
        accountService.createAccount("1001", 500.00);
        Account account = accountService.getAccount("1001");
        assertNotNull(account);  // Check if the account was retrieved
        assertEquals("1001", account.getAccountNumber());  // Verify the account number
        assertEquals(500.00, account.getBalance(), 0.001);  // Verify the balance
    }

    @Test
    public void testGetNonExistentAccount() {
        Account account = accountService.getAccount("9999");
        assertNull(account);  // Check that null is returned for a non-existent account
    }
}
