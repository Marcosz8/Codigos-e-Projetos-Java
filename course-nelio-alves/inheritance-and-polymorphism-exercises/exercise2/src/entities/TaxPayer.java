package entities;

public abstract class TaxPayer {

    private String name;
    private Double anualDouble;

    // == CONSTRUCTORS ==\\
    public TaxPayer(){
    }
    public TaxPayer(String name, Double anualDouble) {
        this.name = name;
        this.anualDouble = anualDouble;
    }
    // == GETTERS & SETTERS ==\\
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnualDouble() {
        return anualDouble;
    }
    public void setAnualDouble(Double anualDouble) {
        this.anualDouble = anualDouble;
    }
    // == METHODS ==\\
    public abstract Double tax();    
}
