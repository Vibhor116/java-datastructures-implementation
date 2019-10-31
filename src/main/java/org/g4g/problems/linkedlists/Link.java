package org.g4g.problems.linkedlists;

public class Link {

	public int iData;
	public Link next;
	public Link(int data) {
		this.iData=data;
	}
	public void displayLink(){
		System.out.print(" "+iData+" ->");
	}
}
