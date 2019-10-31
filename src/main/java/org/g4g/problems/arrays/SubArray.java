package org.g4g.problems.arrays;

public class SubArray {
	public static void main(String[] args) {
		subArray(new int[]{1,2,3,4});
	}

	private static void subArray(int[] arr) {
		// O(n^3) complexity 
		//n*(n+1)/2 arrays
		int length = arr.length;
		for(int i=0;i<length;i++){
			for(int j=i;j<length;j++){
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}