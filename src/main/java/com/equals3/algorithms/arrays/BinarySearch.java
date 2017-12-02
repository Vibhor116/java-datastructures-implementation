package com.equals3.algorithms.arrays;

public class BinarySearch {

	private int[] backingArray;
	private int nItems;
	public BinarySearch(int size) {
		backingArray=new int[size];
		nItems=0;
	}
	public int find(int searchKey){
		int lowerBound = 0;
		int upperBound = nItems-1;
		int curruntIndex;
		while(true){
			curruntIndex = (lowerBound+upperBound)/2;
			if(backingArray[curruntIndex]==searchKey){
				return curruntIndex;
			}
			else 
			{
				if(backingArray[curruntIndex] < searchKey)
					lowerBound = curruntIndex + 1; // it in upper half
				else
					upperBound = curruntIndex - 1; // its in lower half
			}
		}


	}

}
