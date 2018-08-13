package Proxy;

public class ProxySubject implements ISubject {

    private ISubject myProxy = new RealSubject();

    // Delegate the calling of functions to the Proxy-object.
    // In this case the "myProxy"-variable is 
    // the Proxy-object for the RealSubject-class. 
   
    // The user call this function in the main over this class.
    // But in reality the value come from a another class.
    @Override
    public int getIntValue() {
        return this.myProxy.getIntValue() * 100;
    }

    @Override
    public float getFloatValue() {
        return this.myProxy.getFloatValue() * 200.0f;
    }

}
