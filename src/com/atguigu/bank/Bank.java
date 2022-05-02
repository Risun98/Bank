package com.atguigu.bank;

/**
 * @author Risun98
 * @creat 2022-05-02 15:36
 */
public class Bank {
    private Customer[] customers;
    private int numOfCustomers;

    public Bank() {
        customers = new Customer[5];
    }

    public void addCustomer(String f, String l) {
        customers[numOfCustomers++] = new Customer(f, l);
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}
