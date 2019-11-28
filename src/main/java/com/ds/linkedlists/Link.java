// Represent Link of LinkedList

package com.ds.linkedlists;

public class Link{


    public Link next;
    public Link previous;
    public int data;
    public Link(int iData){
        this.data=iData;
    }
    public void displayLink(){
        System.out.print("Link values"+this.data);
    }



}