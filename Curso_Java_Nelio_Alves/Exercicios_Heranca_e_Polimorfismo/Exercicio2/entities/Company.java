package entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    // == CONSTRUTORES ==\\
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
    // == MÉTODOS ==\\
    @Override
    public Double tax() { 
        //IF sendo feito com condicionais ternarias
        double tax = (numberOfEmployees > 10) ? getAnualDouble() * 0.14 : getAnualDouble() * 0.16;
        return tax;
    }    
}

