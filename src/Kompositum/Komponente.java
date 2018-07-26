package Kompositum;

abstract class Komponente {

    String komponentenName;
    
    public abstract void aktualisiere();

    public void tueEtwas() {
	System.out.println("Hallo " + getClass().getSimpleName() + " " + this.komponentenName);
    }
    
}