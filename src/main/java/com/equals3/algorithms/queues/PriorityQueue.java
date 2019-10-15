package com.equals3.algorithms.queues;

public interface PriorityQueue<K,V>{

    int size();
    boolean isEmpty();
    Entry<K,V> min();
    Entry<K,V> removeMin();
    Entry<K,V> insert(K key,V val) throws IllegalArgumentException;

}