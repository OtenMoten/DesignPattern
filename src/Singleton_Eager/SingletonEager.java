package Singleton_Eager;

public class SingletonEager {

    private int iSaveInt;
        
    private static SingletonEager objSingletonEager = new SingletonEager(1);

    // Constructor is private.
    // This is one of the keypoints in the Singleton_Eager design pattern.
    private SingletonEager(int newInt) {
    	iSaveInt = newInt;
    }

    public static SingletonEager getInstance() {
    	return objSingletonEager;
    }

    @Override
    public String toString() {
	return objSingletonEager.hashCode() + " : " + iSaveInt;
    }

    public void setValue(int newInt) {
    	iSaveInt = newInt;
    }

}