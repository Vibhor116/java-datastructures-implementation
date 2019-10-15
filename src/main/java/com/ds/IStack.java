package com.ds;

public interface IStack<T> {

   
    //  push value to stack
    public boolean push(T value);

    // pop  the value of top of the stack
    public T pop();

    //Peek the value from the top of stack.
    
    public T peek();

 

    // Clear the entire stack.
    public void clear();

    // Does stack contain object
    public boolean contains(T value);

    // size of the stack.
    public int size();

 
    // convert sack to queue
    public java.util.Queue<T> toLifoQueue();

    // convert stack to collection
    public java.util.Collection<T> toCollection();
}