package org.g4g.problems.arrays;

import java.util.Arrays;

public class BracketsMatcher {
public static void main(String[] args) {

	int [] arr= {1, 23, 12, 9, 30, 21, 50,100,3,96,10,101};
	for(int i =0 ;i<4;i++){
		for(int j=0;j<arr.length;j++){
			if(arr[i]<arr[j]){
				// swap 
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(arr));

}
}
