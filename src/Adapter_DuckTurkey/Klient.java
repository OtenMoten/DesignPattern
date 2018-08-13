package Adapter_DuckTurkey;

public class Klient {

    public static void main(String[] args) {

        Mallard duck = new Mallard();
        WildTurkey turkey = new WildTurkey();

        // We cover the turkey as a duck with the class "TurkeyAdapter".
        // The "TurkeyAdapter"-class implements the interface "IDuck" and
        // it's functions. Therefore, the turkey can be camouflaged as a duck.
        IDuck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says:");
        turkey.gobble(); // The turkey is gobbling.
        turkey.flyShort(); // The turkey is flying short distances.

        System.out.println();

        System.out.println("Duck says:");
        duck.quack(); // The duck is quacking.
        duck.flyLong(); // The duck is flying long distances.

        System.out.println();

        System.out.println("TurkeyAdapter says:");
        turkeyAdapter.quack(); // Even though of ".quack(9" he makes "Gobble Gobble".
        turkeyAdapter.flyLong();// Even though of ".flyLong()" he makes short flights.	

    }

}