package Kompositum_Directory;

import java.util.ArrayList;

public class Directory extends Component{

    private ArrayList<Component> contentList = new ArrayList<>();
    
    public Directory(String directoryName) {
        super(directoryName);
    }

    public void hinzufuegen(Component objComponent) {
	this.contentList.add(objComponent);
    }
	
    public void entfernen(Component objComponent) {
        this.contentList.remove(objComponent);
    }
	
    public String ausgebenInhalt() {
        
        String ausgabe = "";
        
        for(Component objComponent: contentList) {
		
            ausgabe += objComponent.getName();
                
            if(objComponent.getClass().equals(Directory.class)) {
                ausgabe += "/" + ((Directory)objComponent).ausgebenInhalt() + "\n";
            }
            
        }
            
        return ausgabe;
            
    }

}