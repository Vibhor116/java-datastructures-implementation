//https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/

package com.algo.warmup.linkedlists;

public class SwapNodepairWise{
    private Link first;
     class Link{
        
        Link next;
        Link previous;
        int data;
        Link(int iData){
            this.data=iData;
        }
        public void displayLink(){
            System.out.println(" "+this.data+" ");
        }

    }
     void insertFirst(int key){
        Link newLink = new Link(key);
        newLink.next=first;
        first=newLink;


    }
    public void printList(){

        Link temp = this.first;
        while(temp !=null){
            temp.displayLink();
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
    }
}