package Proxy_Konto;

import java.util.Scanner;

public class ProxyKonto implements IAccount {

    private final IAccount account;
    private final int pincode;

    public ProxyKonto(IAccount userKonto, int newPin) {
        this.account = userKonto;
        this.pincode = newPin;
    }

    @Override
    public void deposit(double input) {
        this.account.deposit(input);
        System.out.println(input + "€ wurden dem Konto gutgeschrieben");
    }
    
    @Override
    public void withdraw(double output) {
       
        System.out.println("Bitte Ihre PIN!");
        
        Scanner scannerObject = new Scanner(System.in);
        int inputPincode = scannerObject.nextInt();
        
        if (inputPincode == this.pincode) {
            this.account.withdraw(output);
            System.out.println(output + "€ wurden abgehoben");
        } else {
            System.out.println("PIN falsch, bitte nochmal versuchen");
            withdraw(output);
        }
        
    }

    @Override
    public void getBalance() {
        this.account.getBalance();
    }
    
}