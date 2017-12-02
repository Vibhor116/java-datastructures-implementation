package com.equals3.algorithms.stacks;

import java.util.Stack;

public class SortStackUsingRecursion {

	public static void main(String[] args) {
		com.equals3.algorithms.stacks.Stack<Integer> intStack =  new com.equals3.algorithms.stacks.Stack<>(10);
			intStack.push(45);
			intStack.push(455);
			intStack.push(15);
			intStack.push(10);
			intStack.push(4545);
		
			System.out.println();
			intStack.search(45);
	}
}


