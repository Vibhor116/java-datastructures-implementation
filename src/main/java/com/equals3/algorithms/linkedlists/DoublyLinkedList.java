package com.equals3.algorithms.linkedlists;

public class DoublyLinkedList {

	public Link first;
	public Link last;
	public DoublyLinkedList() {
		this.first=null;
		this.last=null;
	}
	public boolean isEmpty(){
		return first==null;
	}

	public void insertFirst(int key){
		Link newLink = new Link(key);
		if(isEmpty()){
			last=newLink;
		}
		else{
			first.previous=newLink;
		}
		newLink.next=first;
		first=newLink;
	}

	public void insertLast(int key){
		Link newLink = new Link(key);
		if(isEmpty()){
			first=newLink;
		}else{
			last.next=newLink;
			newLink.previous=last;
		}
		last=newLink;
	}

	public Link deleteFirst(){
		//assumes non empty List
		Link temp =first;

		if(first.next==null){
			//only one item
			last=null;
		}
		first.next.previous=null;
		first=first.next;
		return temp;
	}

	public Link deleteLast(){
		Link temp = last;
		last.previous.next=null;
		last=last.previous;
		return temp;
	}

	public Link deleteKey(int key){
		Link current = first;
		while(current.iData!=key){
			current=current.next;
			if(current == null)
				return null; // didnt find
		}
		if(current==first){
			deleteFirst();
		}
		else if(current==last){
			deleteLast();
		}
		else{
			current.next.previous=current.previous;
			current.previous.next=current.next;
		}
		return current;
	}

	public void displayForward(){

		Link current = first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}

	public void displayBackward(){
		Link current = last;
		while(current!=null){
			current.displayLink();
			current=current.previous;
		}
		System.out.println("");
	}
	
}