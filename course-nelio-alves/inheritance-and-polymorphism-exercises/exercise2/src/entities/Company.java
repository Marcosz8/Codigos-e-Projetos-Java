package entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    // == CONSTRUCTORS ==\\
    public Company(){
        super();
    }
   public Company(String name, Double anualDouble, Integer numberOfEmployees) {
        super(name, anualDouble);
        this.numberOfEmployees = numberOfEmployees;
    }
    // == GETTERS & SETTERS ==\\
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }  
    // == METHODS ==\\
    @Override
    public Double tax() { 
        // IF statements being implemented using ternary conditionals.
        double tax = (numberOfEmployees > 10) ? getAnualDouble() * 0.14 : getAnualDouble() * 0.16;
        return tax;
    }    
}

