package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    // Instantiating an object of type OnlinePaymentService
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contract contract, Integer months) {
        
        Double basicQuota = contract.getTotalValue() / months;
        
        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i); // Creating the variable dueDate and adding pluMonths to it to add the months based on i
            double interest = onlinePaymentService.interest(basicQuota, i); // The simple interest variable (interest) is created by calling the interest method through the onlinePaymentService interface, passing the rate (basicQuota) and the number of months (i).
            double fee = onlinePaymentService.paymentFee(basicQuota + interest); // After calculating the simple interest, the next parameter is to convert the base rate (basicQuota) + the simple interest (interest).
            double quota = basicQuota + interest + fee; // Creating a third variable that calculates the total sum
            contract.getInstallments().add(new Installment(dueDate, quota)); // `contract` is a reference to the object created in the main class when we use the `getInstallments` method to retrieve the array and then add the next object using the `add(new Installment(dueDate, quota)` command.

        }

    }

}
