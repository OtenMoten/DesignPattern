package Kompositum_Directory;

public abstract class Komponente {

    private String name;
	
    public Komponente(String name) {
	this.name = name;
    }
	
    public String getName() {
        return name;
    }
    
}