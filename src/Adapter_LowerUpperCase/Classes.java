package Adapter_LowerUpperCase;

interface Ziel {
    void doUpperCase(String input);
    void doLowerCase(String input);
}

class Adapter implements Ziel {

    private final Provider myProvider = new Provider();

    @Override
    public void doUpperCase(String input) {
        System.out.println(this.myProvider.doUpperCase(input));
    }

    @Override
    public void doLowerCase(String input) {
        System.out.println(this.myProvider.doLowerCase(input));
    }

}