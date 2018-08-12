package Decorator_Counter;

public class Main {

    public static void main(String[] args) {
        
        Container<Integer> containerTreeSet = new TreeSetContainer<>();
        containerTreeSet.add(11);
        containerTreeSet.add(22);
        containerTreeSet.add(3);
        containerTreeSet.print();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        containerTreeSet = new ContainerWithAddCounter<>(containerTreeSet);
        containerTreeSet.add(66);
        containerTreeSet.add(6);
        containerTreeSet.print();

        System.out.println("--------------------------------------");
        System.out.println();
        containerTreeSet.print();
        System.out.println();
        containerTreeSet = new ContainerWithRemoveCounter<>(containerTreeSet);
        containerTreeSet.remove(22);
        containerTreeSet.print();
        System.out.println();

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        containerTreeSet.add(36);
        containerTreeSet.add(16);
        containerTreeSet.remove(11);
        containerTreeSet.print();
        System.out.println();

    }

}