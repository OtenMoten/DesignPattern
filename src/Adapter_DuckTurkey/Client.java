package Adapter_DuckTurkey;

public class Client {

    public static void main(String[] args) {

        Mallard mallardDuck = new Mallard();
        WildTurkey wildTurkey = new WildTurkey();

        // We cover the turkey as a duck with the class "TurkeyAdapter".
        // The "TurkeyAdapter"-class implements the interface "IDuck" and
        // it's functions. Therefore, the turkey can be camouflaged as a duck.
        IDuck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("Turkey says:");
        wildTurkey.gobble(); // The turkey is gobbling.
        wildTurkey.flyShort(); // The turkey is flying short distances.

        System.out.println();

        System.out.println("Duck says:");
        mallardDuck.quack(); // The duck is quacking.
        mallardDuck.flyLong(); // The duck is flying long distances.

        System.out.println();

        System.out.println("TurkeyAdapter says:");
        turkeyAdapter.quack(); // Even though of ".quack(9" he makes "Gobble Gobble".
        turkeyAdapter.flyLong();// Even though of ".flyLong()" he makes short flights.	

    }

}