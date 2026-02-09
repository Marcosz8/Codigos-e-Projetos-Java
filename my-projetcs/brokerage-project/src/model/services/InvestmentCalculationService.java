package model.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import model.policies.Currency;

import model.entities.Investment;

public class InvestmentCalculationService {

    private double calculateBaseAmount(Investment investment, LocalDate targetDate) {
        
        LocalDate depositDate = investment.getDepositDate();
        
        // By comparing past values, it calculates the number of months.
        long months = ChronoUnit.MONTHS.between(
                // Pair the dates to the first days of the month so you can compare and calculate the number of months.
                depositDate.withDayOfMonth(1), 
                targetDate.withDayOfMonth(1)
        );

        if (months < 0) months = 0;

        Currency currency = investment.getCurrency(); // retrieves the registered investment currency
        double amount = investment.getInitialAmount(); // retrieves the initial value of the registered investment
        double interest = amount * currency.monthlyRate() * months; // Interest is calculated based on the currency's interest rate.

        return amount + interest; 
    }
    
    public double calculateWithdrawalAmount(Investment investment, LocalDate actualWithdrawDate) {
        double finalAmount = calculateBaseAmount(investment, actualWithdrawDate);

        // Logic for penalizing early withdrawals
        if (actualWithdrawDate.isBefore(investment.getWithdrawalDate())) {
            double fee = investment.getInitialAmount() * investment.getCurrency().earlyWithdrawalFee();
            finalAmount -= fee;
        }

        return finalAmount;
    }
    
    public double calculateFinalAmount(Investment investment) {
        
        return calculateBaseAmount(investment, investment.getWithdrawalDate());
    }
}

