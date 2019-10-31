package com.equals3.algorithms.linkedlists;

public class LinkedList {

	public Link  first ;

	public LinkedList() {
		this.first=null;
	}

	public Link getFirst(){
		return first;
	}

	public void setFirst(Link l){
		this.first=l;
	}

	public boolean isEmpty(){
		return first==null;
	}

	public void insertFirst(int key){
		Link newLink =  new Link(key);
		newLink.next=first;
		first=newLink;
	}

	public Link deleteFirst(){
		Link temp = first;
		first=first.next;
		return temp;
	}

	public Link find(int key){
		Link current =  first;
		while(current.iData!=key){

			if(current.next == null){
				return null;
			}
			else {
				current = current.next; 
			}
		}
		return current;
	}

	public Link delete(int key){
		Link current = first; 
		Link previous = first;
		while(current.iData != key)
		{
			if(current.next == null){
				return null;

			}
			else
			{
				previous = current;
				current = current.next;

			}
		}
		if(current == first) {
			first = first.next;
		}
		else {
			previous.next = current.next; 
		}
		return current;
	} 
	public void displayList()
	{
		Link current = first; 
		while(current != null) 
		{
			current.displayLink(); 
			current = current.next; 
		}
		System.out.println("");
	}

}
