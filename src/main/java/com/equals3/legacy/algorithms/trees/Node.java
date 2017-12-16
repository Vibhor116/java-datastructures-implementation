package com.equals3.legacy.algorithms.trees;

public class Node {

	public Node leftChild;
	public Node rightChild;
	public int iData;
	public Node(int data) {
		this.iData=data;
	}
	public Node() {

	}
	public void displayNode(){
		System.out.println("{ "+iData+" }");
	}
}
