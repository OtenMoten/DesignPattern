package Proxy_Konto;

import java.util.Scanner;

public class ProxyKonto implements IKonto {

    private final IKonto konto;
    private final int pin;

    public ProxyKonto(IKonto userKonto, int pin) {
        this.konto = userKonto;
        this.pin = pin;
    }

    @Override
    public void einzahlen(double input) {
        this.konto.einzahlen(input);
        System.out.println(input + "€ wurden dem Konto gutgeschrieben");
    }
    
    @Override
    public void abheben(double output) {
       
        System.out.println("Bitte Ihre PIN!");
        
        Scanner scannerObject = new Scanner(System.in);
        int pincode = scannerObject.nextInt();
        
        if (pincode == this.pin) {
            this.konto.abheben(output);
            System.out.println(output + "€ wurden abgehoben");
        } else {
            System.out.println("PIN falsch, bitte nochmal versuchen");
            abheben(output);
        }
        
    }

    @Override
    public void getKontostand() {
        this.konto.getKontostand();
    }
    
}