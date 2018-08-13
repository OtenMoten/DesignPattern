package Adapter_DuckTurkey;

interface ITurkey {

    public void gobble();

    public void flyShort();
    
}

class WildTurkey implements ITurkey {

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void flyShort() {
        System.out.println("I fly short");
    }
    
}