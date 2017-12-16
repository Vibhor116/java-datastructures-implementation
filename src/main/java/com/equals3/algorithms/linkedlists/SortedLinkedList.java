package com.equals3.algorithms.linkedlists;

/*
 * Maintains a sortedLinkedList
 */
public class SortedLinkedList {
	private Link first;
	
	public SortedLinkedList() {
		this.first=null;
	}
	
	public boolean isEmpty(){
		return this.first==null;
	}
	
	public int size(){
		Link current = first;
		int count =0;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void insert(int key){
		Link  current = first;
		Link previous = null;
		Link newLink = new Link(key);

		if(isEmpty()){
			newLink.next=first;
			first=newLink;
		}
		else{
			while(current!=null && current.iData<key){
				previous=current;
				current=current.next;
			}
			previous.next=newLink;
			newLink.next=current;
		}
	}
	public Link remove(){
		Link temp=first;
		first=first.next;
		return temp;
	}

	public void displayList(){
		System.out.println("printing {First --> Last");
		Link current = first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");

	}
}
