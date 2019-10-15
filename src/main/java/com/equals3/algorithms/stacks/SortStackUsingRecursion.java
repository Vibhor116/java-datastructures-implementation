package com.equals3.algorithms.stacks;

import java.util.ListIterator;
import java.util.Stack;

//https://www.geeksforgeeks.org/sort-a-stack-using-recursion/
public class SortStackUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.push(45);
		myStack.push(455);
		myStack.push(15);
		myStack.push(10);
		myStack.push(4545);
		sortStackUsingRecursion(myStack);
		ListIterator<Integer> it = myStack.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static void sortStackUsingRecursion(Stack<Integer> myStack) {

		if (!myStack.isEmpty()) {
			// remove top item
			int topItem = myStack.pop();
			sortStackUsingRecursion(myStack);
			// Push the top item back in sorted stack

			sortedInsert(myStack, topItem);
		}
	}

	private static void sortedInsert(Stack<Integer> myStack, int topItem) {
		// base
		if (myStack.isEmpty() || topItem > myStack.peek()) {
			myStack.push(topItem);
			return;
		}
		int temp = myStack.pop();
		sortedInsert(myStack, topItem);
		myStack.push(temp);
	}

}
