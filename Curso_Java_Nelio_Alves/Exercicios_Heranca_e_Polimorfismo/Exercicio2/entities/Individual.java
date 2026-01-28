package entities;

public class Individual extends TaxPayer {

   private Double healthExpenditures;
   
     // == CONSTRUTORES ==\\
    public Individual(){
        super();
    }   
    public Individual(String name, Double anualDouble, Double healthExpenditures) {
    super(name, anualDouble);
    this.healthExpenditures = healthExpenditures;
    }
    // == GETTERS & SETTERS ==\\
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    // == MÉTODOS ==\\

    @Override
    public Double tax() { 
        double tax = 0.00;
        if (getAnualDouble() < 20000.00){
            tax = getAnualDouble() * 0.15;
        }else{
            tax = getAnualDouble() * 0.25;
        }
       
        tax -= getHealthExpenditures()*0.5;
        
        //Caso a conta dê imposto negativo
        if (tax < 0.0){
            tax = 0.0; 
        }
        
        return tax;
    }
}
