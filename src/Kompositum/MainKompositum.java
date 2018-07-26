package Kompositum;

public class MainKompositum {

    public static void main(String[] args) {
	
	Blatt blatt_one = new Blatt("1");
	Blatt blatt_two = new Blatt("2");
	KompositumKomponente objKompositumKomponente_A = new KompositumKomponente("A");
	KompositumKomponente objKompositumKomponente_B = new KompositumKomponente("B");
		
	objKompositumKomponente_A.hinzu(blatt_two);
	objKompositumKomponente_A.hinzu(objKompositumKomponente_B);
        
	objKompositumKomponente_A.aktualisiere();

	System.out.println();
	
	objKompositumKomponente_A.hinzu(blatt_one);
	objKompositumKomponente_A.hinzu(objKompositumKomponente_B);
	objKompositumKomponente_B.hinzu(blatt_two);
        
	objKompositumKomponente_A.aktualisiere();
		
	System.out.println();
		
	objKompositumKomponente_B.aktualisiere();

    }

}