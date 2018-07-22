package Singleton_Eager;

public class MainEagerThreads {

    public static void main(String[] args) throws InterruptedException {
	
        new Thread_One("THREAD one ").start();
	Thread.sleep(1000);
	new Thread_Two("THREAD two ").start();
        
    }

}

class Thread_One extends Thread {

    public Thread_One(String nameOfThread) {
    	super(nameOfThread);
    }

    @Override
    public void run() {
	
        SingletonEager objSingletonEager = SingletonEager.getInstance();
	objSingletonEager.setValue(111);

        try {
            sleep(1000);
            System.out.println(objSingletonEager);
	} 
        catch (InterruptedException objInterruptedException) {}
        
    }

}

class Thread_Two extends Thread {

    public Thread_Two(String nameOfThread) {
    	super(nameOfThread); 
    }

    @Override
    public void run() {
	
        SingletonEager objSingletonEager = SingletonEager.getInstance();
	objSingletonEager.setValue(222);
			
        try {
            sleep(1000);
            System.out.println(objSingletonEager);
	} 
        catch (InterruptedException objInterruptedException) {}
        
    }
}