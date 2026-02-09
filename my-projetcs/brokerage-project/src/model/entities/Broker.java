package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.services.InvestmentCalculationService;

public class Broker {

    private List<Investment> investments = new ArrayList<>();

    public void addInvestment(Investment investment) {
        investments.add(investment);
    }

    public List<Investment> getInvestments() {
        return investments;
    }
    
    public void printInvestmentsOrderedById() {
        // 1. Create a copy of the list so we don't mess up the original order
        List<Investment> sortedList = new ArrayList<>(investments);

        // 2. Sort the list by ID
        // The compareTo method works perfectly for Integers
        sortedList.sort((i1, i2) -> i1.getId().compareTo(i2.getId()));

        // 3. Print the results
        System.out.println("--- INVESTMENTS LISTED BY ID ---");
        for (Investment inv : sortedList) {
            System.out.println(" | ID: " + inv.getId() + 
             " | Currency: " + inv.getCurrency().getName() +
             " | Deposit Date : " + inv.getDepositDate() +
             " | Expected Withdrawal Date : " + inv.getWithdrawalDate() +
             " | Initial Amount: " + inv.getInitialAmount() +
             " | Final Amount: " + inv.getFinalAmount());
        }
    }
    
   public Investment findById(int id) {
        return investments.stream()
                .filter(inv -> inv.getId().equals(id))
                .findFirst()
                .orElse(null);
    }   

    public double getTotalAmount() {
        double total = 0.0;

        for (Investment inv : investments) {
            total += inv.getFinalAmount();
        }
        return total;
    } 

    public double getSubtotalByClient(String clientName) {
        
        double subtotal = 0.0;

        for (Investment inv : investments) {
            if (inv.getCustomer().equalsIgnoreCase(clientName)) {
                subtotal += inv.getFinalAmount();
            }
        }
        return subtotal;
    }

    public void printInvestmentsOrderedByClient() {

        List<Investment> sortedList = new ArrayList<>(investments);
    
        // Sorts by comparing names, ignoring case.
        sortedList.sort((i1, i2) -> i1.getCustomer().compareToIgnoreCase(i2.getCustomer()));

        for (Investment inv : sortedList) {
             System.out.println("Client: " + inv.getCustomer() +
             " | ID: " + inv.getId() +
             " | Currency: " + inv.getCurrency().getName() +
             " | Deposit Date : " + inv.getDepositDate() +
             " | Expected Withdrawal Date : " + inv.getWithdrawalDate() +
             " | Initial Amount: " + inv.getInitialAmount() +
             " | Final Amount: " + inv.getFinalAmount());
        }
    }
    
    public double withdrawInvestment(int investmentId, LocalDate withdrawDate, InvestmentCalculationService service) {
        
        // The Iterator creates an object that knows the position of all items in the list.
        Iterator<Investment> iterator = investments.iterator();

        while (iterator.hasNext()) { 
            Investment inv = iterator.next();

            if (inv.getId().equals(investmentId)) {
                
                // Code communicating with the service class part
                double amountToReceive = service.calculateWithdrawalAmount(inv, withdrawDate);

                // Safely removes the current investment from the collection
                iterator.remove();

                return amountToReceive;
            }
        }
        // Throws an exception if the ID is not found.
        throw new IllegalArgumentException("Investment ID " + investmentId + " not found.");
    }
}
