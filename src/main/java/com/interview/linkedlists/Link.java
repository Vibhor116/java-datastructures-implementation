package com.interview.linkedlists;

public class Link {

    public int iData;
    public Link next;
    public Link previous;
    public Link(int data){
       this.iData = data;
    }
    public void displayLink(){
        System.out.print("{"+this.iData+"}");
    }
}
