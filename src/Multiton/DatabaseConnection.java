package Multiton;

public class DatabaseConnection {
    
    private final String connectionString;

    public DatabaseConnection(String connectionString) {
       	this.connectionString = connectionString;
    }
	
    public void open(Integer key) {
	System.out.println("Connection with " + connectionString + " " + key + " is creating.");		
    }

}