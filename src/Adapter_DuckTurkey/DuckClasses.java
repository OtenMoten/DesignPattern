package Adapter_DuckTurkey;

interface IDuck {

    public void quack();

    public void flyLong();
    
}

class Mallard implements IDuck {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

    @Override
    public void flyLong() {
        System.out.println("I fly long");
    }

}