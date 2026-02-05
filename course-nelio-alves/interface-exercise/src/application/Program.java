package application;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalServices;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (!success) {
            try{
                System.out.println("Enter the contract details: ");
                System.out.print("Number: ");
                int number = sc.nextInt();
                sc.nextLine();
                System.out.print("Date (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.nextLine(),fmt);
                System.out.print("Contract value: ");
                double totalValue = sc.nextDouble();

                // Instantiating a contract and creating a contract object.
                Contract c = new Contract(number,date,totalValue);

                System.out.print("Enter the number of installments: ");
                int numberInstallments = sc.nextInt();
                
                // Instantiating a contract service and creating a contract service object.
                ContractService service = new ContractService(new PaypalServices());

                // Processing the contract and creating the installments.
                service.processContract(c, numberInstallments);        
                
                System.out.println("Installments : ");

                // Printing the contract installments
                for (Installment installment : c.getInstallments()) {
                    System.out.println(installment);
                }

                success = true;
            }
            catch(InputMismatchException e) {
                System.out.print("Input error: Please enter valid numbers. Try again.");
                sc.nextLine();
            }
            catch(DateTimeException e){
                System.out.print("Date error: Please use the format dd/MM/yyyy. Try again.");
            }
        }
                    
        sc.close();
    }
}
