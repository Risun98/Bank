package com.atguigu.bank;

/**
 * @author Risun98
 * @creat 2022-05-02 16:12
 */
public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}
