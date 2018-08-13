package Adapter_DuckTurkey;

public class TurkeyAdapter implements IDuck {

    ITurkey turkey;

    public TurkeyAdapter(ITurkey newTurkey) {
        this.turkey = newTurkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void flyLong() {
        this.turkey.flyShort();
    }

}