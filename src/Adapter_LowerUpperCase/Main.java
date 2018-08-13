package Adapter_LowerUpperCase;

public class Main {

    public static void main(String[] args) {
        Client myClient = new Client();
        myClient.doUpperCase("AbCdE");
        myClient.doLowerCase("uVwXyZ");
    }

}