package Proxy;

public class EchtesSubjekt implements ISubjekt {

    protected int intValue;
    protected float floatValue;

    EchtesSubjekt() {
        this.intValue = 1;
        this.floatValue = 1.0f;
    }

    @Override
    public int getIntValue() {
        System.out.print("EchtesSubjekt.getIntValue() --> ");
        return this.intValue;
    }

    @Override
    public float getFloatValue() {
        System.out.print("EchtesSubjekt.getFloatValue() --> ");
        return this.floatValue;
    }

}