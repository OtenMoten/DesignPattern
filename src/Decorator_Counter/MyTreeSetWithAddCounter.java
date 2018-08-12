package Decorator_Counter;

import java.util.Collection;
import java.util.TreeSet;

public class MyTreeSetWithAddCounter extends TreeSet {

    private int addCounter;

    public boolean add(String e) {
        addCounter++;
        return super.add(e);
    }

//	public boolean addAll(Collection c){
//		addCounter += c.size();
//		return super.addAll(c);		
//	}
    public int getCounter() {
        return addCounter;
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