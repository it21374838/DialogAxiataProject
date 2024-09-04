package com.example.DialogProject.Model;

public class Transaction {
    private String sourceAccountNumber;
    private String destinationAccountNumber;
    private double amount;

    //Getters and Setters
    
    public String getSourceAccountNumber() {
        return sourceAccountNumber;
    }
    public void setSourceAccountNumber(String sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }
    public String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }
    public void setDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

   
}
