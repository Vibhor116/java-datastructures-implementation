package com.equals3.algorithms.stacks;

import java.util.Arrays;

public class Stack<T> implements Comparable<T> {
	private T[] backingArray;
	int top = -1;
	T maxElement;

	@SuppressWarnings("unchecked")
	public Stack(int size) {
		backingArray=(T[]) new Object[size];
	}

	public void push(T t){
		if(this.compareTo(t)>0){
			maxElement=t;
		}
		backingArray[++top] = t;
	}

	public T pop(){
		return backingArray[top--];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public T peek(){
		return backingArray[top];
	}
	
	@Override
	public String toString() {
		// or roll  your own toString Implementation
		return Arrays.toString(backingArray);
	}
	
	public T search(T seachItem){
		while(!this.isEmpty()){
		T popValue=	this.pop();
		  if(popValue==seachItem){
			  return popValue;
		  }
		}
		return seachItem;
		
	}
	
	public int getIndex(T elem){
		while(!this.isEmpty()){
			if(this.pop()==elem){
				
			}
			
		}
		return 1;
	}

	@Override
	public int compareTo(T o) {
		return o.toString().compareTo((String) this.maxElement);
	}
}
