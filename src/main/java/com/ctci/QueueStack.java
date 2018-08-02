package com.ctci;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack<T> {

    Queue<T> queue= new LinkedList<T>();

    public void push(T elem){
        int size  = queue.size();
        queue.add(elem);
        for(int i=0;i<size;i++){

            T x = queue.remove();
            queue.add(x);
        }
    }
    public static void main(String[] args) {


        QueueStack<Integer> queueStack = new QueueStack<>();
        queueStack.push(10);
        queueStack.push(20);

    }

}
