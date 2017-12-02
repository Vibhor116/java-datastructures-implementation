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
	public void insertFirst(){
		Link newLink =  new Link(10);
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
		while(current!=null){

			if(current.iData==key){
				return current;
			}
			current=current.next;
		}
		return null;
	}
	public void delete(int key){
		Link previous = first;
		Link cLink= first;
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
	public ListIterator getIterator() 
	{
	return new ListIterator(this); 
	} 
}
