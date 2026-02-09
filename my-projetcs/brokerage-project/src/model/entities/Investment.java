package model.entities;

import java.time.LocalDate;

import model.policies.Currency;

public class Investment {
    
    // Static counter used to generate unique investment IDs
    private static int counter = 1000;
    private Integer id;
    private String customer;
    private Currency currency;
    private LocalDate depositDate;
    private LocalDate withdrawalDate;
    private double initialAmount;    
    private double finalAmount;

    public Investment(String customer, Currency currency, LocalDate depositDate, LocalDate withdrawalDate, double initialAmount) {
        
        // Deposit and withdrawal dates must not be null.
        if (depositDate == null || withdrawalDate == null)
            throw new IllegalArgumentException("Dates are required");

        // The initial deposit date cannot be earlier than the current date; otherwise, it throws an exception.
        if (depositDate.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("The deposit date cannot be in the past!");
    
        // The withdrawal date must be after the deposit date; otherwise, it throws an exception.
        if (withdrawalDate.isBefore(depositDate))
            throw new IllegalArgumentException("Withdraw date must be after deposit date");
        
        // The initial balance must be positive; otherwise, an exception is thrown.
        if (initialAmount <= 0) 
            throw new IllegalArgumentException("Initial amount must be positive");    
        
        this.id = counter++;
        this.customer = customer;
        this.currency = currency;
        this.depositDate = depositDate;
        this.withdrawalDate = withdrawalDate;
        this.initialAmount = initialAmount;
        
    }
    public Integer getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }
    
    public Currency getCurrency() {
        return currency;
    }

    public LocalDate getDepositDate() {
        return depositDate;
    }

    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public double getFinalAmount() {
        return finalAmount;
    }
    
    // Used internally by the calculation service to update the final amount
    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }
}
