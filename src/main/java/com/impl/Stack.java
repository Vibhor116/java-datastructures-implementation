package com.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Queue;
import com.ds.IStack;

public class Stack<T> implements IStack<T> {

    private static final int MINIMUM_SIZE = 1024;

    private T[] arr = (T[]) new Object[MINIMUM_SIZE];
    private int size = 0;

    @Override
    public boolean push(T value) {
        if (size >= arr.length) {
            // return false or grow;
            this.grow();
        }
        arr[size++] = value;
        return true;
    }

    @Override
    public T pop() {
        // chk emptyness
        if (size <= 0) {
            return null;
        }
        return arr[size--];
    }

    @Override
    public T peek() {
        // chk emptyness
        if (size <= 0) {
            return null;
        }
        return arr[size];

    }

   
    @Override
    public void clear() {
        this.size=0;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            T obj = arr[i];
            if (obj.equals(value))
                return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Queue<T> toLifoQueue() {
        return null;
    }

    @Override
    public Collection<T> toCollection() {
        return null;
    }

    // grow the arry by 50%
    private void grow() {
        int newSize = arr.length + (arr.length) / 2;
        arr = Arrays.copyOf(arr, newSize);
    }

    // Shrink the array by 50%
    private void shrink() {
        int shrinkSize = arr.length >> 1;
        arr = Arrays.copyOf(arr, shrinkSize);
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            builder.append(arr[i]).append(", ");
        }
        return builder.toString();
    }
        
}