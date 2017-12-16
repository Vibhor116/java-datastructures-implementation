package org.g4g.problems.arrays;

// http://www.geeksforgeeks.org/find-zeroes-to-be-flipped-so-that-number-of-consecutive-1s-is-maximized/

public class MaximumZeroFlipping {
	public static void main(String[] args) {
		int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
		int m=2;
		//int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				int j =i;
				int count =0;
				while(arr[j--]!=0){
					count++;
					
					
				}
				System.out.println(count);
			}
		}
		
		
			System.out.println();
	}
}
