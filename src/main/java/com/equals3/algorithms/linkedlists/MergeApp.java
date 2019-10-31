package com.equals3.algorithms.linkedlists;

public class MergeApp {
	public static void main(String[] args) {
		int[] arrayA = {23, 47, 81, 95};
		int[] arrayB = {7, 14, 39, 55, 62, 74};
		int[] arrayC = new int[10];
		merge(arrayA, 4, arrayB, 6, arrayC);
		display(arrayC, 10);
	}

	private static void display(int[] arrayC, int i) {
		for(int j=0; j<i; j++)
			System.out.print(arrayC[j] + " ");
		System.out.println(" ");

	}
	public static void merge( int[] arrayA, int sizeA,
			int[] arrayB, int sizeB,
			int[] arrayC )
	{
		int aDex=0, bDex=0, cDex=0;
		while(aDex < sizeA && bDex < sizeB) // neither array empty
			if( arrayA[aDex] < arrayB[bDex] )
				arrayC[cDex++] = arrayA[aDex++];
			else
				arrayC[cDex++] = arrayB[bDex++];
		while(aDex < sizeA) // arrayB is empty,
			arrayC[cDex++] = arrayA[aDex++]; // but arrayA is
		while(bDex < sizeB) // arrayA is empty,
			arrayC[cDex++] = arrayB[bDex++]; // but arrayB isn
	} 
}
