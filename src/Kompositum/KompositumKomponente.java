package Kompositum;

import java.util.ArrayList;
import java.util.List;

class KompositumKomponente extends Komponente {
	
    List<Komponente> listeDerKomponenten = new ArrayList<>();
	
    public KompositumKomponente(String kompositumKomponentenName){   
    	super.komponentenName = kompositumKomponentenName;
    }

    @Override
    public void aktualisiere() {
        super.tueEtwas();
        for (Komponente komponenteAusListe : listeDerKomponenten) {komponenteAusListe.aktualisiere();}
    }
	
    public void hinzu(Komponente objKomponente){
    	listeDerKomponenten.add(objKomponente);
    }

}