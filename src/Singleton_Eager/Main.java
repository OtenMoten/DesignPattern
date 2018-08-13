package Singleton_Eager;

public class Main {

    public static void main(String[] args) {

        SingletonEager objSingletonEager_1 = SingletonEager.getInstance();
	
        System.out.println(objSingletonEager_1);
		
        SingletonEager objSingletonEager_2 = SingletonEager.getInstance();
	
        objSingletonEager_2.setValue(33);
        
	System.out.println(objSingletonEager_2);		
	System.out.println(objSingletonEager_1);	
    
    }

}