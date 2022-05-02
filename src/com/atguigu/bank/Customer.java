package com.atguigu.bank;

/**
 * @author Risun98
 * @creat 2022-05-02 15:18
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public Account setAccount(Account account) {
        this.account = account;
        return account;
    }
}
