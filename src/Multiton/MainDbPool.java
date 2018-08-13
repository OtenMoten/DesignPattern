package Multiton;

public class MainDbPool {

    public static void main(String[] args) {

        DbPoolConnection connection_1 = DbPoolConnection.getInstance(1);
	DbPoolConnection connection_2 = DbPoolConnection.getInstance(2);
	DbPoolConnection connection_3 = DbPoolConnection.getInstance(3);
        DbPoolConnection connection_4 = DbPoolConnection.getInstance(4);
        DbPoolConnection connection_5 = DbPoolConnection.getInstance(5);
	
        System.out.println();
	System.out.println(connection_1);
	System.out.println(connection_2);
        System.out.println(connection_3);
        System.out.println(connection_4);
        System.out.println(connection_5);
	
    }

}