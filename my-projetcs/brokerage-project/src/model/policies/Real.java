package model.policies;

public class Real implements Currency{

    @Override
    public double monthlyRate() {
        return 0.01; 
    }

    @Override
    public double earlyWithdrawalFee() {
        return 0.04; 
    }

    @Override
    public String getName() {
        return "Real";
    }
}
