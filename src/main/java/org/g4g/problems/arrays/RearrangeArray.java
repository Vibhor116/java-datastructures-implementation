package org.g4g.problems.arrays;

import java.util.Arrays;

//http://www.geeksforgeeks.org/rearrange-array-arrj-becomes-arri-j/
public class RearrangeArray {
	public static void main(String[] args) {
		int [] arr= {2, 0, 1, 4, 5, 3};
		int tempArr[] = new int[arr.length];
		for(int i =0 ;i<arr.length;i++){
			System.out.println(arr[i]);
			tempArr[arr[i]]=i;
		}
		System.out.println(Arrays.toString(tempArr));
	}

}
