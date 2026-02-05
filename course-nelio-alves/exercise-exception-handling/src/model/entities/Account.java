package model.entities;

import model.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    // == CONSTRUCTORS == \\
    public Account(){
    }
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // == GETTERS AND SETTERS == \\
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
     public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    // == METHODS == \\
    public void deposit(Double amount) {
        balance += amount;
    }
    public void withdraw(Double amount) throws BusinessException {
        if (amount >= withdrawLimit){
            throw new BusinessException("The amount exceeds withdraw limit");
        }
        if (amount >= balance){
            throw new BusinessException("Not enough balance");
        }        
        balance -= amount;
    }    
}
