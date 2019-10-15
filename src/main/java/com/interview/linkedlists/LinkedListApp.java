package com.interview.linkedlists;

public class LinkedListApp{
    public static void main(String[] args) {
        
        LinkList list  =  new LinkList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

       // while(!list.isEmpty()){
           list.displayList();
    //    }
    }
}