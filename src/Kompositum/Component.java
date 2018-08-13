package Kompositum;

abstract class Component {

    String komponentenName;
    
    public abstract void aktualisiere();

    public void tueEtwas() {
	System.out.println("Hallo " + getClass().getSimpleName() + " " + this.komponentenName);
    }
    
}