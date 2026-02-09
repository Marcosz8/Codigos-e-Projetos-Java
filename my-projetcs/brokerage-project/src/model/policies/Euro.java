package model.policies;

public class Euro implements Currency {

    @Override
    public double monthlyRate() {
        return 0.0075; 
    }

    @Override
    public double earlyWithdrawalFee() {
        return 0.03; 
    }

    @Override
    public String getName() {
        return "Euro";
    }
}
