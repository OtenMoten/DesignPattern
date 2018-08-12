package Decorator_Counter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        Container<Integer> con = new TreeSetContainer<Integer>();
        con.add(new Integer(11));
        con.add(new Integer(22));
        con.add(3);
        con.print();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        con = new ContainerWithAddCounter<Integer>(con);
        con.add(66);
        con.add(6);
        con.print();

        System.out.println("--------------------------------------");
        System.out.println();
        con.print();
        System.out.println();
        con = new ContainerWithRemoveCounter<Integer>(con);
        con.remove(22);
        con.print();
        System.out.println();

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        con.add(36);
        con.add(16);
        con.remove(11);
        con.print();
        System.out.println();

    }

}