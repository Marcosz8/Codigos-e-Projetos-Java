package model.services;

public class PaypalServices implements OnlinePaymentService {

    @Override    
    public double paymentFee(double amount) {
        return amount * 0.02;       
    }

    @Override
    public double interest(double amount, Integer months) {
        return amount * (months / 100.00);
    }
}
