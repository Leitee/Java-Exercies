package com.company.lab2;

public class Account {

    private int accountNumber;
    private  double balance = 0.0;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Custom constructor
     * @param balance
     */
    public Account(double balance, int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        if(balance >= amount){
            balance -= amount;
        }else {
            System.out.println("Amount withdraw exceeds the current balance.");
        }
    }


    @Override
    public String toString() {
        return "Account: " + this.accountNumber + " Balance: $" + this.balance;
    }
}
