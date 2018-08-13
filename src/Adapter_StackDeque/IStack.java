package Adapter_StackDeque;

public interface IStack<elementType> {

    boolean isEmpty();

    void push(elementType x);

    elementType pop();

    elementType top();
    
    elementType bottom();
    
}