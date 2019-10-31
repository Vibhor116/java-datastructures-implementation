package com.equals3.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {3,5546,57,9,04};
		System.out.println(Arrays.toString(arr));
		for(int i = 0 ;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
			 if(arr[i]>arr[j]){
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			 }
			}
		}
	System.out.println(Arrays.toString(arr));
	}
}
