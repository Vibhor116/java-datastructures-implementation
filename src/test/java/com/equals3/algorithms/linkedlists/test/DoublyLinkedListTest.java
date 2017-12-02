package com.equals3.algorithms.linkedlists.test;

import org.junit.Test;

import com.equals3.algorithms.linkedlists.DoublyLinkedList;

public class DoublyLinkedListTest {

	@Test
	public void testDoublyLinkedList(){
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(22); 
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertLast(11); 
		theList.insertLast(33);
		theList.insertLast(55);
		theList.deleteFirst();
		theList.displayForward();
	}

}
