package com.programcreek;

/**
 * Merge two sorted linked lists and return it as a new list
 */
public class MergeSortedLinkedLists {

    private Link first;

    class Link {
        int iData;
        Link next;

        Link(int i) {
            this.iData = i;
            this.next = null;
        }

        public void displayLink() {
            Link link = this;
            System.out.println("" + this.iData);
        }
    }

    public void insertFirst(int key) {
        Link newLink = new Link(key);
        newLink.next = first;
        first = newLink;
    }

    public void printLinkedList(){
        Link firstLink =  this.first;
        while(firstLink !=null){
            System.out.println(firstLink.iData);
            firstLink=firstLink.next;
        }
    }

    public static void main(String[] args) {

        MergeSortedLinkedLists mergeSortedLinkedLists = new MergeSortedLinkedLists();
        mergeSortedLinkedLists.insertFirst(1);
        mergeSortedLinkedLists.insertFirst(2);
        mergeSortedLinkedLists.insertFirst(3);
        mergeSortedLinkedLists.insertFirst(4);
        mergeSortedLinkedLists.printLinkedList();

    }
}
