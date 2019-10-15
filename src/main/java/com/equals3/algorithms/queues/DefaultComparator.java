package com.equals3.algorithms.queues;

import java.util.Comparator;

public class DefaultComparator<E> implements Comparator<E>
{

    @Override
    public int compare(E o1, E o2) {
        return ((Comparable<E>) o1).compareTo(o2);
    }

}