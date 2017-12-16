package org.g4g.problems.trees;

public class Node {

	public int iData;
	public Node leftChild;
	public Node rightChild;
	public Node(int data) {
		this.iData=data;
		leftChild=null;
		rightChild=null;

	}
	public void displayLink(){
		System.out.print(" { "+this.iData+" } ");
	}

}
