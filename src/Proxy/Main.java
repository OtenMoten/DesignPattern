package Proxy;

public class Main {

    public static void main(String[] args) {

        System.out.println("Direct access on RealSubject");
        ISubject sub = new RealSubject();
        System.out.println("a: " + sub.getIntValue());
        System.out.println("b: " + sub.getFloatValue());

        System.out.println();
        System.out.println("Access via Proxy on RealSubject");
        ISubject proxy = new ProxySubject();
        System.out.println("a: " + proxy.getIntValue());
        System.out.println("b: " + proxy.getFloatValue());

    }

}
