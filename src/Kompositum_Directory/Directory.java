package Kompositum_Directory;

import java.util.ArrayList;

public class Directory extends Komponente{

    private ArrayList<Komponente> contentList = new ArrayList<>();
    
    public Directory(String directoryName) {
        super(directoryName);
    }

    public void hinzufuegen(Komponente objComponent) {
	contentList.add(objComponent);
    }
	
    public void entfernen(Komponente objComponent) {
        contentList.remove(objComponent);
    }
	
    public String ausgebenInhalt() {
        
        String ausgabe = "";
        
        for(Komponente objComponent: contentList) {
		
            ausgabe += objComponent.getName();
                
            if(objComponent.getClass().equals(Directory.class)) {
                ausgabe += "/" + ((Directory)objComponent).ausgebenInhalt() + "\n";
            }
            
        }
            
        return ausgabe;
            
    }

}