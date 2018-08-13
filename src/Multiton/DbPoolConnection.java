package Multiton;

import java.util.HashMap;

public final class DbPoolConnection {
	
    private static HashMap<Integer, DbPoolConnection> mapOfDbConnections = new HashMap<Integer, DbPoolConnection>(); 

    private final DatabaseConnection objDatabaseConnection;
    
    private DbPoolConnection(Integer key) {
        
        this.objDatabaseConnection = new DatabaseConnection("Connection-String");
	this.objDatabaseConnection.open(key);
        
	System.out.println(getDatabaseConnection());
        
    }
	
    public DatabaseConnection getDatabaseConnection() {
    	return this.objDatabaseConnection;    
    }
	
    public static DbPoolConnection getInstance(Integer key) {
    
        synchronized(mapOfDbConnections)	{
            
            DbPoolConnection objDbPoolConnection = mapOfDbConnections.get(key);
            
	    if (objDbPoolConnection == null) {
                objDbPoolConnection = new DbPoolConnection(key);
		mapOfDbConnections.put(key, objDbPoolConnection);
            }
            
            return objDbPoolConnection;
            
	}
        
    }

}