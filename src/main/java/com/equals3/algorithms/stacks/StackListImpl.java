package com.equals3.algorithms.stacks;

import com.equals3.algorithms.linkedlists.LinkedList;

public class StackListImpl {

	private LinkedList linkedList;

	public StackListImpl() {
		this.linkedList=new LinkedList();
	}

	public void push(int key){
		this.linkedList.insertFirst(key);
	}
	public void pop(){
		this.linkedList.deleteFirst();
	}
	public boolean isEmpty() 
	{
		return ( linkedList.isEmpty() );
	}
	public void displayStack()
	{
		System.out.print("Stack (top-->bottom): ");
		this.linkedList.displayList();
	}
}
