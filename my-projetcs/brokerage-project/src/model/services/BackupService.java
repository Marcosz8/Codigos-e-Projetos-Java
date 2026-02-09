package model.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import model.entities.Investment;

public class BackupService {

    public boolean saveInvestmentsToFile(String path, List<Investment> investments) {
        
        // try-with-resources ensures the file is closed automatically
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            
            bw.newLine();// Adds an empty line at the beginning of the file for readability

            for (Investment inv : investments) {
                bw.write("Client: " + inv.getCustomer() +
             " | ID: " + inv.getId() +
             " | Currency: " + inv.getCurrency().getName() +
             " | Deposit Date : " + inv.getDepositDate() +
             " | Expected Withdrawal Date : " + inv.getWithdrawalDate() +
             " | Initial Amount: " + inv.getInitialAmount() +
             " | Final Amount: " + inv.getFinalAmount());
                bw.newLine();
            }
            return true; // Success!
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false; // Something went wrong
        }
    }
}
