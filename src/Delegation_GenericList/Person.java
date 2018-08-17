package Delegation_GenericList;

public class Person extends AHuman implements Comparable {

    public Person(String newName, int newDate, double newLoan) {
        super(newName, newDate, newLoan);
    }

    @Override
    public int compareTo(Object otherHuman) {
        return this.getName().compareTo(((Person) otherHuman).getName());
    }

}
