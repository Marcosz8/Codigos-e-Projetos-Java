package model.policies;

public class Dolar implements Currency{

    @Override
    public double monthlyRate() {
        return 0.005; 
    }

    @Override
    public double earlyWithdrawalFee() {
        return 0.02; 
    }

    @Override
    public String getName() {
        return "Dollar";
    }
}
