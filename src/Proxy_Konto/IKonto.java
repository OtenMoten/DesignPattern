package Proxy_Konto;

public interface IKonto {

    void abheben(double output);

    void einzahlen(double input);

    void getKontostand();

}