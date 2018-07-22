package Kompositum_Directory;

public class Main {

    public static void main(String[] args) {	
			
        File file1 = new File("File 1");
	File file2 = new File("File 2");		
        File file3 = new File("File 3");
	Directory layer1 = new Directory("Layer 1");
	Directory layer2 = new Directory("Layer 2");
			
	layer1.hinzufuegen(layer2);
        
	layer1.hinzufuegen(file1);
        
	layer2.hinzufuegen(file2);
        
        layer2.hinzufuegen(file3);
			
	System.out.println("Inhalt von Verzeichnis Layer 1");
	System.out.println(layer1.ausgebenInhalt());
			
	System.out.println("\nInhalt von Verzeichnis Layer 2");
	System.out.println(layer2.ausgebenInhalt());

    }
    
}