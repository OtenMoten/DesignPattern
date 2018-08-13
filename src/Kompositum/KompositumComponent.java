package Kompositum;

import java.util.ArrayList;
import java.util.List;

class KompositumComponent extends Component {
	
    List<Component> listeDerKomponenten = new ArrayList<>();
	
    public KompositumComponent(String kompositumKomponentenName){   
    	super.komponentenName = kompositumKomponentenName;
    }

    @Override
    public void aktualisiere() {
        super.tueEtwas();
        for (Component komponenteAusListe : listeDerKomponenten) {komponenteAusListe.aktualisiere();}
    }
	
    public void hinzu(Component objKomponente){
    	listeDerKomponenten.add(objKomponente);
    }

}