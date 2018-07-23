package Singleton_Lazy;

public class MainLazy {
	
    public static void main(String[] args) {

        SingletonLazy objSingletonLazy_One = SingletonLazy.getInstance();		
	System.out.println(objSingletonLazy_One);
		
	SingletonLazy objSingletonLazy_Two = SingletonLazy.getInstance();
	objSingletonLazy_Two.setValue(44);
        
	System.out.println(objSingletonLazy_Two);		
	System.out.println(objSingletonLazy_One);	
	
    }

}