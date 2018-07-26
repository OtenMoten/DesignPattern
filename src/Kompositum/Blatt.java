package Kompositum;

class Blatt extends Komponente {
	
    public Blatt(String blattName){
       	super.komponentenName = blattName;
    }

    @Override
    public void aktualisiere() {
	tueEtwas();
    }
    
}