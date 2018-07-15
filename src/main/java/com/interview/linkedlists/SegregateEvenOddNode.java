package com.interview.linkedlists;



public class SegregateEvenOddNode {
    public static Link first;
    public static void main(String [] args){

        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        displayList();
        segregateEvenOdd();
        displayList();
    }

    private static  void displayList(){
        Link firstLink = SegregateEvenOddNode.first;
        while(firstLink!=null){
            System.out.print(firstLink.iData+" ");
            firstLink=firstLink.next;
        }


    }
    public static void insert(int key){
        Link newLink = new Link(key);
        newLink.next=first;
        first=newLink;
    }

    private static  void segregateEvenOdd(){
        Link lastLink = first;
        Link current = first;
        Link previous =null;

        while(lastLink.next!=null){
            lastLink=lastLink.next;
        }
        Link newLastLink = lastLink;
        // Consider all odd nodes before getting first even node
        while(current.iData %2 != 0 && current !=lastLink){
        newLastLink.next=current;
        current=current.next;
        newLastLink.next.next=null;
        newLastLink=newLastLink.next;

        }
        // do following steps only if there is an even node
        if(current.iData %2 ==0){
        first =current;
        // now current points to first even node
            while(current != lastLink){
                if(current.iData %2 ==0){
                previous =current;
                current =current.next;
                }
                else{
                    previous.next=current.next;
                    current.next=null;
                    newLastLink.next=current;
                    newLastLink=current;
                    current=previous.next;

                }
            }
        }
        else{
            previous=current;
        }
        if (newLastLink != lastLink && lastLink.iData %2 != 0)
        {
            previous.next = lastLink.next;
            lastLink.next = null;
            newLastLink.next = lastLink;
        }
    }

}
