package Proxy;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zugriff auf EchtesSubjekt direkt");
        ISubjekt sub = new EchtesSubjekt();
        System.out.println("a: " + sub.getIntValue());
        System.out.println("b: " + sub.getFloatValue());

        System.out.println();
        System.out.println("Zugriff auf EchtesSubjekt über Proxy");
        ISubjekt proxy = new ProxySubjekt();
        System.out.println("a: " + proxy.getIntValue());
        System.out.println("b: " + proxy.getFloatValue());

    }

}
