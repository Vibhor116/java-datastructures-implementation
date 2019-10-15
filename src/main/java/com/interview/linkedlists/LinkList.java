package com.interview.linkedlists;

public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void insertFirst(int item) {

        Link newLink = new Link(item);
        newLink.next = first;
        first = newLink;

    }

    public Link deleteFirst() {

        Link temp = this.first;
        first = first.next;
        return temp;

    }

    public Link find(int elem) {
        Link temp = first;
        while (temp.iData != elem) {
            if (temp.next == null) {
                return null;
            } else {
                temp = temp.next;

            }
        }
        return temp;
    }

    public Link delete(int key) {
        Link current = this.first; // delete link with given key , assumes non empty list
        Link previous = this.first;

        // find link first
        while (current.iData != key) {
            if (current.next == null) {
                // end of list didnt find it
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next; // change first

        } else {
            previous.next = current.next; // bypass it

        }

        return current;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning of list
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public Link reverseList(Link first){
        Link prev=null;
        Link current = first;
        Link next=null;
        while(current!=null){
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        first = prev; 
        return first;


    }
}