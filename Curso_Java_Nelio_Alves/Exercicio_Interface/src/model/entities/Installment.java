package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private LocalDate dueDate;
    private Double amount;

    // == CONSTRUCTORS == \\
    public Installment(){
    }
    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }
    // == GETTERS AND SETTERS == \\
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    } 
    // == METHODS == \\
    @Override
    public String toString() {
        return dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
           + " - " 
           + String.format("%.2f", amount);
} 

}
