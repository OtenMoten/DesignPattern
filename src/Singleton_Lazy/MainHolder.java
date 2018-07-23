package Singleton_Lazy;

public class MainHolder {

    public static void main(String[] args) {

        Something objSomething_One = Something.getInstance();
        Something objSomething_Two = Something.getInstance();
        
	System.out.println(objSomething_One);
        System.out.println(objSomething_Two);

    }

}

class Something {
	
    // Constructor is private.
    private Something() {}

    // This is a inner class.
    private static class LazyHolder {
    	// Create a encapsulated instance of the class "Something"
        // in a save memory space.
        private static final Something INSTANCE = new Something();
    }

    public static Something getInstance() {
	// Call via class reference because the class above is static
        return LazyHolder.INSTANCE;
    }

}