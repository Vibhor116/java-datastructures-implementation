package org.g4g.problems.arrays;

import java.sql.Array;
import java.util.Arrays;

public class SplitArrayIntoEqualSubArrays {
	public static void main(String[] args) {
		int[] arr = {33 ,47 ,70 ,37 ,8 ,53 ,13 ,93 ,71 ,72 ,51 ,100 ,60 ,87, 97};


		int shift =13;

		for (int i = 0; i < shift; i++) {
			int temp = arr[0];

			for (int j = 0; j < arr.length; j++) {

				if ((j + 1) < arr.length) {
					arr[j] = arr[j + 1];
				}
			}
			arr[arr.length - 1] = temp;

		}
		System.out.println(Arrays.toString(arr));
	}
}
