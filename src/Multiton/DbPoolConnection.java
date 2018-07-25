package Multiton;

import java.util.HashMap;

public final class DbPoolConnection {
	
    private static HashMap<Integer, DbPoolConnection> mapOfDbConnections = new HashMap<Integer, DbPoolConnection>(); 

    private DatabaseConnection objDatabaseConnection;
    
    private DbPoolConnection(Integer key) {
        
        objDatabaseConnection = new DatabaseConnection("Connection-String");
	objDatabaseConnection.open(key);
        
	System.out.println(getDatabaseConnection());
        
    }
	
    public DatabaseConnection getDatabaseConnection() {
    	return objDatabaseConnection;    
    }
	
    public static DbPoolConnection getInstanz(Integer key) {
    
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