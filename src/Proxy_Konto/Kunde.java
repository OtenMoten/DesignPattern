package Proxy_Konto;

public class Kunde {
	
	public void einzahlen(double input, IKonto kontoName){
		kontoName.einzahlen(input);
	}
	public void abheben (double output, IKonto kontoName){
		kontoName.abheben(output);
	}
	public void getKontostand(IKonto kontoName){
		kontoName.getKontostand();
	}
        
}