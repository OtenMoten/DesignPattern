package Proxy_Accounting;

public class Account implements IAccount {

    private double balance;

    public Account(double newBalance) {
        this.balance = newBalance;
    }

    @Override
    public void withdraw(double output) {
        this.balance -= output;
    }

    @Override
    public void deposit(double input) {
        this.balance += input;
    }

    @Override
    public void getBalance() {
        System.out.println("Balance: " + this.balance);
    }
    
}