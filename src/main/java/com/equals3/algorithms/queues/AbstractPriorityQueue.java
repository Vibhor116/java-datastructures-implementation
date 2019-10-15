package com.equals3.algorithms.queues;

import java.util.Comparator;

public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V> {

    // nested PQEntry class

    protected static class PQEntry<K,V> implements Entry<K,V>{

        private K key ;
        private V value;

        
        public PQEntry(K key,V value){
                this.key=key;
                this.value=value;
        }
// methods of the Entry interface
        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }
        // utilities not exposed as part of the Entry interface
        protected void setKey(K key){
            this.key=key;
        }
        protected void setValue(V value){
            this.value=value;
        }

    } //----------- end of nested PQEntry class -----------

    // the comparator define order of keys in priority queue
    private Comparator<K> comp;
    /**  Creates an empty priority queue using the given comparator to order keys. 
    */
    protected AbstractPriorityQueue(Comparator<K> c) { comp = c; }

    protected AbstractPriorityQueue( ) { this(new DefaultComparator<K>( )); }

    protected int compare(Entry<K,V> a, Entry<K,V> b) {
        return comp.compare(a.getKey( ), b.getKey( ));
     }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public Entry<K, V> min() {
        return null;
    }

    @Override
    public Entry<K, V> removeMin() {
        return null;
    }

    @Override
    public Entry<K, V> insert(K key, V val) throws IllegalArgumentException {
        return null;
    }

}