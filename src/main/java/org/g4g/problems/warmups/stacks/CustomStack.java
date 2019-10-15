package org.g4g.problems.warmups.stacks;

import java.util.Arrays;

public class CustomStack<E> {

    private int top = 0;
    E backingArray[];

    CustomStack(int SIZE) {
        this.backingArray = (E[]) new Object[SIZE];
    }

    public void push(E elem) {
        ensureCapacity();
        this.backingArray[top] = elem;
        top++;
    }

    private void ensureCapacity() {
        if (top == backingArray.length) {
            // create copy
            backingArray = Arrays.copyOf(backingArray, 2 * backingArray.length + 1);
        }
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public E peek(){
        return this.backingArray[top];
    }
    public E pop() {
       
        return this.backingArray[--top];
    }
    

}