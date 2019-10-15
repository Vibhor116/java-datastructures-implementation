package com.equals3.algorithms.linkedlists;


public class DetectLoopLinkedList{

    private static Link first;
    protected static class Link{

        Link next;
        Link prev;
        int iData;
        Link(int data){
            this.iData=data;
        }
        public void displayData(){
            
            System.out.println("{ "+this.iData+" }");

        }
        Link(){

        }
    }

    public static void insertFirst(int key){
        Link newLink = new Link(key);
        newLink.next=first;
        first=newLink;

    }

    public static void displayList(){
        Link currunt =  first;
        while(currunt !=null){
            System.out.println(currunt.iData);
            currunt=currunt.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        //  had to  create loop for testing
        DetectLoopLinkedList.insertFirst(1);
        DetectLoopLinkedList.insertFirst(2);
        DetectLoopLinkedList.insertFirst(3);
        DetectLoopLinkedList.insertFirst(4);
        DetectLoopLinkedList.insertFirst(5);

        //point 5->3
        first.next.next.next.next.next=first.next.next;
        boolean found = detectLoop(first); 
        System.out.println(found);

    }

    private static boolean detectLoop(Link first) {
       
        //  create temp node
        Link newLink = new Link();
       while(first != null){
           // This condition is for the case 
            // when there is no loop 
            if (first.next == null) { 
                return false; 
            } 
  
            // Check if next is already 
            // pointing to temp 
            if (first.next == newLink) { 
                return true; 
            } 
            // Store the pointer to the next node 
            // in order to get to it in the next step 
            Link nex = first.next; 
  
            // Make next point to temp 
            first.next = newLink; 
  
            // Get to the next node in the list 
            first = nex; 
       }
        return false;
    }
}