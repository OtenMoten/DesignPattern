package Singleton_Enum;

public class MainEnum {

    public static void main(String[] args) {

        SingletonEnum objNicolaus = SingletonEnum.INSTANCE;
	objNicolaus.verteileGaben();
        
	SingletonEnum objSanta = SingletonEnum.INSTANCE;
	objSanta.verteileGaben();
        
	System.out.println(objNicolaus.hashCode());
	System.out.println(objSanta.hashCode());
        
    }

}