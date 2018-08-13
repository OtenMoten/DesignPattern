package Proxy_Konto;

public class Konto implements IKonto {

    private double kontoStand;

    public Konto(double newKontostand) {
        this.kontoStand = newKontostand;
    }

    @Override
    public void abheben(double output) {
        this.kontoStand -= output;
    }

    @Override
    public void einzahlen(double input) {
        this.kontoStand += input;
    }

    @Override
    public void getKontostand() {
        System.out.println("Kontostand: " + this.kontoStand);
    }
    
}