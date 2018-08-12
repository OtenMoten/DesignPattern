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

//	public static void main(String[] args) {
//		
//		TreeSet<String> c = new TreeSet<String>();
//		c.add("a"); c.add("b");  c.add("x");
//		
//		MyTreeSetWithAddCounter myTree = new MyTreeSetWithAddCounter();
//		myTree.addAll(c);		
//		myTree.add("c");
//
//		
//		System.out.println(myTree.getCounter());
//		System.out.println(myTree);
//	}
}
