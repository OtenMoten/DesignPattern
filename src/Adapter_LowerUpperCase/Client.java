package Adapter_LowerUpperCase;

public class Client {

    private final Ziel myAdapter = new Adapter();

    public void doUpperCase(String input) {
        this.myAdapter.doUpperCase(input);
    }

    public void doLowerCase(String input) {
        this.myAdapter.doLowerCase(input);
    }

}