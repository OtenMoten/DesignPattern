package Proxy_Konto;

public class Main {

    public static void main(String[] args) {
        
        // Create a user bank account with €1000.0 initial capital.
        // Addidionally, create a pincode to access the bank account.
        IAccount myKundenKonto = new ProxyKonto(new Account(1000.0), 1234);

        Customer myKunde = new Customer();
        
        // Each operation need to be executed via a "Customer"-object.
        myKunde.getBalance(myKundenKonto);
        myKunde.deposit(500.00, myKundenKonto);
        myKunde.getBalance(myKundenKonto);

        myKunde.withdraw(700.00, myKundenKonto);
        myKunde.getBalance(myKundenKonto);

    }

}