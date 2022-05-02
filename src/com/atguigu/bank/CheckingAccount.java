package com.atguigu.bank;

/**
 * @author Risun98
 * @creat 2022-05-02 16:12
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    @Override
    public boolean withdraw(double money) {
        if (money > 0) {
            if (balance > money) {
                balance -= money;
                System.out.println("取出" + money + "元，" + "余额为：" + balance);
                return true;
            } else if (overdraftProtection > money) {
                overdraftProtection -= money;
                System.out.println("使用花呗支付：" + money + "元，" + "花呗余额为：" + overdraftProtection);
                return true;
            } else if (overdraftProtection + balance > money) {
                balance = balance - (money - overdraftProtection);
                overdraftProtection = 0;
                System.out.println("使用花呗与余额混合支付：" + money + "元，"
                        + "花呗余额为0元，账户余额为：" + balance);
                return true;
            } else {
                System.out.println("余额不足，请重试：");
                return false;
            }
        }
        System.out.println("取出金额非法！");
        return false;
    }
}
