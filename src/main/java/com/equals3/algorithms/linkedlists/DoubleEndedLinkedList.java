package com.equals3.algorithms.linkedlists;

public class DoubleEndedLinkedList {

	private Link first;
	private Link last;
	
	public DoubleEndedLinkedList() {
		this.first=null;
		this.last=null;
	}
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int key){
		Link newLink =  new Link(key);
		if(isEmpty()){
			last=newLink;
			
		}
		newLink.next=first;
		first=newLink;
		
	}
	
	public void insertLast(int key){
		Link newLink  =  new Link(key);
		if(isEmpty()){
			first=newLink;
		}
		else{
			last.next=newLink;
		}
		last=newLink;
	}
}
