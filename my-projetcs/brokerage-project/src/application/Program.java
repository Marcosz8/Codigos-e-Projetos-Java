package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.*;
import model.policies.*;
import model.services.*;

public class Program {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Broker broker = new Broker();
        InvestmentCalculationService investmentCalculationService = new InvestmentCalculationService();
       
        System.out.println("=========================================");
        System.out.println("====== INTERNATIONAL ONLINE BROKER ======");
        System.out.println("=========================================");
        System.out.println();
        System.out.println("=========================================");
        System.out.println("1 - Add an investment");
        System.out.println("2 - Withdrawal from investment");
        System.out.println("3 - View all releases");
        System.out.println("4 - Search and save information");        
        System.out.println("0 - Close ");
        System.out.println("=========================================");
        
        int option  = sc.nextInt();

        while (option != 0) {
            try{
                switch (option) {
                    case 1:
                        sc.nextLine(); 
                        System.out.println("Type your name.");
                        String name = sc.nextLine();                    
                        System.out.println("Choose the currency you wish to invest in: ");
                        System.out.println("1 - Real => Yields 1.00% per month ");
                        System.out.println("2 - Dollar => Yields 0.05% per month");
                        System.out.println("3 - Euro => Yields 0.75% per month.");
                        int typeAdd = sc.nextInt();
                        System.out.println("Enter the deposit amount.");
                        double depositAmount = sc.nextDouble();
                        
                        Currency currency;
                        
                        if (typeAdd == 1) {
                            currency = new Real();
                        } else if (typeAdd == 2) {
                            currency = new Dolar();
                        } else if (typeAdd == 3) {
                            currency = new Euro();
                        } else {
                            throw new IllegalArgumentException("Opção inválida!");
                        }
                        
                        System.out.println("Enter the initial deposit date (DD/MM/YYYY).");
                        String startDate = sc.next();
                        LocalDate depositDate = LocalDate.parse(startDate, fmt);
                        System.out.println("Expected withdrawal date (DD/MM/YYYY).");
                        String endDate = sc.next();
                        LocalDate withdrawalDate = LocalDate.parse(endDate, fmt);
                        
                        // Creates a new investment and adds it to the list.
                        Investment investment = new Investment(name, currency, depositDate, withdrawalDate, depositAmount);                    
                        broker.addInvestment(investment);

                        // Calculates the final amount based on currency rate and expected withdrawal date
                        double finalAmount = investmentCalculationService.calculateFinalAmount(investment);                        
                        investment.setFinalAmount(finalAmount);
                        
                        System.out.println("Investment added successfully! The transaction ID is: " + investment.getId());                       
                        break;

                    case 2:
                        System.out.println("Enter the ID to withdraw your investment:");
                        int idToWithdraw = sc.nextInt();    
                                            
                        Investment foundInv = broker.getInvestments() // Get the investment list
                                                    .stream() // Transforms the list into a stream
                                                    .filter(i -> i.getId().equals(idToWithdraw)) // Filter by desired ID.
                                                    .findFirst() // Grab the first one you find.
                                                    .orElse(null); // If it doesn't exist, return null.                        
                        if (foundInv != null) { 

                            System.out.println("Enter the date to withdraw your investment (DD/MM/YYYY):");
                            String dateInput = sc.next();

                            LocalDate withdrawDate = LocalDate.parse(dateInput, fmt);

                            double previewAmount = investmentCalculationService.calculateWithdrawalAmount(foundInv, withdrawDate);
            
                            System.out.println("=========================================");
                            System.out.printf("Withdrawal Preview for: %s%n", foundInv.getCustomer()); 
                            System.out.printf("Value to be received on %s: $ %.2f%n", withdrawDate.format(fmt), previewAmount); 
                            System.out.println("=========================================");

                            System.out.println("Confirm withdrawal? (y/n)");
                            char confirm = sc.next().toLowerCase().charAt(0);
            
                            if (confirm == 'y') {
                            broker.withdrawInvestment(idToWithdraw, withdrawDate, investmentCalculationService);
                            System.out.println("Withdrawal processed successfully!");
                            } 
                            else {
                            System.out.println("Withdrawal cancelled.");
                            }
                        } 
                        else {
                            System.out.println("Error: Investment ID not found.");
                        }
                        break;

                    case 3:
                        System.out.println("=========================================");
                        System.out.println("ALL NEW RELEASES: ");
                        broker.printInvestmentsOrderedByClient();
                        System.out.println("=========================================");
                        System.out.println("Do you want to save this list? (y/n)");
                        char save = sc.next().toLowerCase().charAt(0);

                        if (save == 'y') {
                            System.out.println("Enter the path (C:\\temp\\backup.txt):");
                            sc.nextLine(); // Clear buffer
                            String path = sc.next();
                            BackupService backupService = new BackupService();                           
                           
                            // Stores the result to check whether the file operation was successful
                            boolean success = backupService.saveInvestmentsToFile(path, broker.getInvestments());

                            if (success) {
                                System.out.println("FILE SAVED SUCCESSFULLY!");
                            } else {
                                System.out.println("FAILED TO SAVE FILE. Please check the path and permissions.");
                            }
                        }
                        else {
                            System.out.println("The list did not save; you returned to the main program.");
                        }
                        break;

                    case 4:
                        System.out.println("=========================================");
                        System.out.println("1 - Earch by ID");
                        System.out.println("2 - View all transactions with subtotals by customer.");
                        System.out.println("3 - View total income");
                        System.out.println("==========================================");
                        int optionSearch = sc.nextInt();

                        if (optionSearch == 1) {
                            System.out.println("Enter the desired ID ");
                            int idSearch = sc.nextInt();

                            Investment found = broker.getInvestments().stream()
                                                     .filter(inv -> inv.getId().equals(idSearch))
                                                     .findFirst()
                                                     .orElse(null);
                            if (found != null) {
                                 System.out.println("Investment Found: " + found.getCustomer() + " | Value: " + found.getFinalAmount());
                            }
                            else {
                                System.out.println("Investment with ID " + idSearch + " not found.");
                            }                           
                        }
                        else if (optionSearch == 2) {
                                             
                            broker.printInvestmentsOrderedByClient();

                            System.out.println("\n Enter a name to see their specific subtotal:");
                            sc.nextLine(); // clear buffer
                            String clientName = sc.nextLine();
                            double subtotal = broker.getSubtotalByClient(clientName);
                            System.out.printf("Subtotal for %s: %.2f%n", clientName, subtotal);
                        }
                        else{
                            double total = broker.getTotalAmount();
                            System.out.println("=========================================");
                            System.out.printf("TOTAL PORTFOLIO VALUE: $ %.2f%n", total);
                            System.out.println("=========================================");
                        }
                        break;
                    
                    default:
                        System.out.println("Invalid option!");
                        break;
                    }
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("1 - Add an investment");
                    System.out.println("2 - Withdrawal from investment");
                    System.out.println("3 - View all releases");
                    System.out.println("4 - Search and save information");
                    System.out.println("0 - Close ");
                    System.out.println("==========================================");
                    option  = sc.nextInt();            
            }
            catch (IllegalArgumentException e) {
            // Captures the errors you threw in the Investment class.
            System.out.println("Input error: " + e.getMessage());
            } 
            catch (java.time.format.DateTimeParseException e) {
            // Captures dates entered in the wrong format.
            System.out.println("Date format error! Please use DD/MM/YYYY.");
             }
            catch (java.util.InputMismatchException e) {
            // Captures data when the user types a letter where a number should be entered.
             System.out.println("Invalid input! Please enter numbers only.");
            sc.nextLine(); // Clear the buffer to prevent infinite loops.
             }
            catch (Exception e) {
            // Fallback catch for unexpected runtime errors
            System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }       

        sc.close();
    }
}


