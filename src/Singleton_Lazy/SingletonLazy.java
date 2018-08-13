package Singleton_Lazy;

public class SingletonLazy {

    private static SingletonLazy objSingletonLazy;
    private int iSaveInt;

    // Constructor is private.
    // This is one of the keypoints in the Singleton_Lazy design pattern.
    private SingletonLazy() {}

    public static SingletonLazy getInstance() {

        if (objSingletonLazy == null) {objSingletonLazy = new SingletonLazy();}
  
        return objSingletonLazy;
            
    }

    @Override
    public String toString() {
        return objSingletonLazy.hashCode() + " : ... " + this.iSaveInt; 
    }

    public void setValue(int newInt) {
	this.iSaveInt = newInt;
    }

}