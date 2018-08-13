package Decorator_Counter;

import java.util.Collection;
import java.util.TreeSet;

public class MyTreeSetWithAddCounter extends TreeSet {

    private int addCounter;

    public boolean add(String newElementObject) {
        this.addCounter++;
        return super.add(newElementObject);
    }

    public boolean addCollection(Collection newCollectionObject) {
        this.addCounter += newCollectionObject.size();
        return super.addAll(newCollectionObject);
    }

    public int getCounter() {
        return this.addCounter;
    }

}