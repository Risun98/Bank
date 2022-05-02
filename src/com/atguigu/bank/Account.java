package com.atguigu.bank;

/**
 * @author Risun98
 * @creat 2022-05-02 15:06
 */
public class Account {
    protected double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("存入" + money + "元，" + "余额为：" + balance);
            return true;
        }
        System.out.println("存入金额非法！");
        return false;
    }

    public boolean withdraw(double money) {
        if (money > 0) {
            if (balance > money) {
                balance -= money;
                System.out.println("取出" + money + "元，" + "余额为：" + balance);
                return true;
            }
            System.out.println("余额不足，请重试：");
            return false;
        }
        System.out.println("取出金额非法！");
        return false;
    }

}
