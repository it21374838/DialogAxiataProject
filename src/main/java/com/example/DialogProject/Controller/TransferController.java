package com.example.DialogProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DialogProject.Model.Transaction;
import com.example.DialogProject.Service.TransferService;

@RestController
@RequestMapping("/api/transfers")//path to transfer operations
public class TransferController {
    @Autowired
    private TransferService transferService;

    @PostMapping
    public ResponseEntity<String> transfer(@RequestBody Transaction transaction) {
        String result = transferService.transferFunds(transaction.getSourceAccountNumber(),
                                                     transaction.getDestinationAccountNumber(),
                                                     transaction.getAmount());
        return ResponseEntity.ok(result);
    }
}

