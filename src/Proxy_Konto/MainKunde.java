package Proxy_Konto;

public class MainKunde {

    public static void main(String[] args) {
        
        // Create a user bank account with €1000.0 initial capital.
        // Addidionally, create a pincode to access the bank account.
        IKonto myKundenKonto = new ProxyKonto(new Konto(1000.0), 1234);

        Kunde myKunde = new Kunde();
        
        // Each operation need to be executed via a "Kunde"-object.
        myKunde.getKontostand(myKundenKonto);
        myKunde.einzahlen(500.00, myKundenKonto);
        myKunde.getKontostand(myKundenKonto);

        myKunde.abheben(700.00, myKundenKonto);
        myKunde.getKontostand(myKundenKonto);

    }

}