package com.equals3.algorithms.linkedlists;

public class Link {

	public int iData;
	public Link next;
	public Link previous; // previous link in list
	public Link(int data) {
		this.iData=data;
	}
	public void displayLink(){
		System.out.println("{ "+iData+" }");
	}

}
