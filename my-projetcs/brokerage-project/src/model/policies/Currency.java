package model.policies;

public interface Currency {

    // Taxa de juros 
    double monthlyRate();

    // Taxa de penalização de saque antecipado
    double earlyWithdrawalFee();

    // Nome da moeda
    String getName();

}
