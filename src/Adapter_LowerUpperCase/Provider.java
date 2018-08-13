package Adapter_LowerUpperCase;

class Provider {

    public String doUpperCase(String input) {
        return input.toUpperCase();
    }

    public String doLowerCase(String input) {
        return input.toLowerCase();
    }
    
}