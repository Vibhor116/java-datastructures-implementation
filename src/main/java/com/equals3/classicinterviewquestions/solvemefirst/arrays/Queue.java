package com.equals3.classicinterviewquestions.solvemefirst.arrays;

public class Queue {

    private int[] arr;
    private int size;
    private int maxSize;
    int front = 0;
    int rear = -1;

    Queue(int a) {
        maxSize = a;
        arr = new int[a];
        front = 0;
        rear = -1;
    }

    public void insert(int elem) {
        arr[++rear] = elem;

    }

    public static void main(String[] args) {

    }
}