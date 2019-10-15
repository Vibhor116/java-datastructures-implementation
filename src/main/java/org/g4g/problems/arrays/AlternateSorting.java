package org.g4g.problems.arrays;

import java.io.IOException;
import java.util.Arrays;

public class AlternateSorting {

	public static void main(String[] args) {
		int arr[] = {9,7,8,6,5,1,2,3,4};
		
		
	
	}

	public static int[] alertnateSortingWithExtraSpace_M1(int[] arr) {
		int temp[] = new int[arr.length];
		Arrays.sort(arr);
		int left=0;
		int right = arr.length-1;
		int i =0;
		while(left<right){
			temp[i++] = arr[left++];
			temp[i++]= arr[right--];
		}
		if(arr.length%2!=0){
			temp[i++]= arr[left];
		}
		return temp;

	}
	public static int[] alertnateSortingWithExtraSpace_M2(int[] arr) {
		int temp[] = new int[arr.length];
		Arrays.sort(arr);
		int left=0;
		int right = arr.length-1;
		for(int i=0;i<arr.length;i++){
			if(i%2==0)
				temp[i]=arr[left++];
			else
				temp[i]=arr[right--];
		}
		return temp;
	}

	public static void main(String[] args) throws IOException {
	
	    String s ="sample string";
	
	    int val[] = new int[256];
	    for(int i=0;i<s.length();i++){
	        val[s.charAt(i)]++;
	    }
	    System.out.println(Arrays.toString(val));
	
	
	
	
	
	}

	public static int recursive(int fact,int result) {
	
	    if(fact==1){
	        return  result;
	    }
	return recursive(fact*fact-1, result);
	}
}
