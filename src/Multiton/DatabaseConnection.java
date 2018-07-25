package Multiton;

public class DatabaseConnection {
    
    private final String connectionString;

    public DatabaseConnection(String connectionString) {
       	this.connectionString = connectionString;
    }
	
    public void open(Integer key) {
	System.out.println("es wird connectiert mit " + connectionString + " " + key);		
    }

}