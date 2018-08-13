package Kompositum;

public class Main {

    public static void main(String[] args) {
	
	Leaf blatt_one = new Leaf("1");
	Leaf blatt_two = new Leaf("2");
	KompositumComponent objKompositumKomponente_A = new KompositumComponent("A");
	KompositumComponent objKompositumKomponente_B = new KompositumComponent("B");
		
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