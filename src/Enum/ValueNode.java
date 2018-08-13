package Enum;

class ValueNode implements IExpTree {

    double doubleValue;

    public ValueNode(double newDoubleValue) {
        this.doubleValue = newDoubleValue;
    }

    @Override
    public double calculate() {
        return this.doubleValue * 125.0d;
    }

}