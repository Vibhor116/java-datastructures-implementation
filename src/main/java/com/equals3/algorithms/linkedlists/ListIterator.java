package com.equals3.algorithms.linkedlists;

public class ListIterator {

	private Link currunt;
	private Link previous;
	private LinkedList linkedList;
	public ListIterator(LinkedList linkedList) {
		this.linkedList=linkedList;
		reset();
	}
	public void reset() {
		Link first=linkedList.getFirst();
		currunt=first;
		previous=null;
	}

}
