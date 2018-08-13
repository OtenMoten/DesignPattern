package Proxy;

public class RealSubject implements ISubject {

    protected int intValue;
    protected float floatValue;

    RealSubject() {
        this.intValue = 1;
        this.floatValue = 1.0f;
    }

    @Override
    public int getIntValue() {
        System.out.print("RealSubject.getIntValue() --> ");
        return this.intValue;
    }

    @Override
    public float getFloatValue() {
        System.out.print("RealSubject.getFloatValue() --> ");
        return this.floatValue;
    }

}