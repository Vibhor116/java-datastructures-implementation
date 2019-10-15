package com.equals3.algorithms.stacks;

public class FixedSizeArrayStack {

    int size;
    int top = 0;
    int arr[];

    public FixedSizeArrayStack() {
        arr= new int[15];
    }

    public void push(int elem) {
        ensureCapacity();
        arr[top++]=elem;
    }
}