package org.g4g.problems.linkedlists;
//http://www.geeksforgeeks.org/reverse-a-linked-list/
public class LinkedListReverse {

	private Link first;

	public LinkedListReverse() {
		this.first=null;
	}

	public void insertFirst(int key){
		Link newLink = new Link(key);
		newLink.next=first;
		first= newLink;
	}
	public void displayList(){
		Link currunt =  first;
		while(currunt !=null){
			currunt.displayLink();
			currunt=currunt.next;

		}
	}
	public void reverseLinkedList(){
		Link current = first;
		Link previous = null;
		Link next = null;
		while(current != null){
			next=current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		this.first=previous;


	}
	public void recursiveReverse(Link first){

		Link secondNode = first.next;
		first.next=null;
		recursiveReverse(secondNode);
		secondNode.next = first;	
	}


	public static void main(String[] args) {
		LinkedListReverse r = new LinkedListReverse();
		r.insertFirst(70);
		r.insertFirst(60);
		r.insertFirst(40);
		r.insertFirst(10);
		r.displayList();
		r.reverseLinkedList();
		System.out.println();
		r.displayList();

	}
}
