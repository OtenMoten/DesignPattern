package Proxy_Accounting;

public interface IAccount {

    void withdraw(double output);

    void deposit(double input);

    void getBalance();

}