package Adapter_StackDeque;

import java.util.ArrayDeque;

public class Klient {

    public static void main(String[] args) {

        IStack<Integer> stack = new StackAdapter<>(new ArrayDeque());
        
        stack.push(5);
        stack.push(2);
        stack.push(3);
        
        System.out.println("First number of the stack: " + stack.top());
        System.out.println("Last number of the stack: " + stack.bottom());
        while (!stack.isEmpty()) System.out.println(stack.pop());
        
        System.out.println("Is the stack empty? : " + stack.isEmpty());
        
    }

}