package Singleton_Enum;

public class Main {

    public static void main(String[] args) {

        SingletonEnum objNicolaus = SingletonEnum.INSTANCE;
	objNicolaus.giveGods();
        
	SingletonEnum objSanta = SingletonEnum.INSTANCE;
	objSanta.giveGods();
        
	System.out.println("Hi, I'm Nicolaus. My hashcode is: " + objNicolaus.hashCode());
	System.out.println("Hi, I'm Santa. My hashcode is: " + objSanta.hashCode());
        
    }

}