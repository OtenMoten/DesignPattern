package Delegation_GenericList;

public class Main {

    public static void main(String[] args) {

        Person personAlpha = new Person("Willy", 1990, 2000.0);
        Person personBeta = new Person("Conrad", 1989, 1077.0);
        Person personGamma = new Person("Alfredo", 1996, 2120.0);

        //  The output is '2' because A is two letters far away from C.
        System.out.println(personBeta.compareTo(personGamma));
        //  The output is '-20' because W is twenty letters far away from C.
        System.out.println(personBeta.compareTo(personAlpha));

        System.out.println();
        System.out.println("- Get the LOGICALLY the last object of three. -");

        //  'Last' means the highest value. This behaviour is due to the
        //  implemented interfaced called "Comparable" in the class "Operator."
        //  We can access this class directly via it's class-name because it has
        //  not a constructor and only static methods.
        System.out.println("Highest value: " + Operator.getLast(2, 4, 11));
        //  ".getLast(x,y,z)" works with String-objects alphabetically.
        System.out.println("Lowest element: " + Operator.getLast("Tuck", "Tack", "Tick"));
        //  In this case, the names of the person, due to the overriden function ".toString()"+
        //  in the class person, are compared each other.
        System.out.println("Highest element: " + Operator.getLast(personAlpha, personBeta, personGamma));

        System.out.println();
        System.out.println("- Get the LOGICALLY last object of three. -");

        System.out.println("Lowest value: " + Operator.getFirst(2, 14, 11));
        System.out.println("Lowest element: " + Operator.getFirst("Tick", "Tuck", "Tack"));
        System.out.println("Lowest element: " + Operator.getFirst(personAlpha, personBeta, personGamma));

    }
}
