package Multiton;

public class MainDbPool {

    public static void main(String[] args) {

        DbPoolConnection con1 = DbPoolConnection.getInstanz(1);
	DbPoolConnection con2 = DbPoolConnection.getInstanz(2);
	DbPoolConnection con3 = DbPoolConnection.getInstanz(1);
	
        System.out.println();
	System.out.println(con1);
	System.out.println(con2);
	
        System.out.println(con3);
	
    }

}