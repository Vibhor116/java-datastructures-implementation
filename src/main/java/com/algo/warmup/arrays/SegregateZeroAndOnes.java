package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SegregateZeroAndOnes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputArray[] = br.readLine().split("\\s+");
        int finalArray[] = new int[inputArray.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = Integer.parseInt(inputArray[i]);
        }
        // logic goes here
        int left = 0;
        int right = finalArray.length - 1;
        while (left < right) {
            while (finalArray[left] == 0) {
                left++;
            }
            while (finalArray[right] == 1) {
                right--;
            }
            // now left and right index will point to vice-versa elements
            if (left < right) { // not sorted yet
                // swap
                finalArray[left] = 0;
                finalArray[right] = 1;
                left++;
                right--;
            }
        }
        // print o/p
        System.out.println(Arrays.toString(finalArray));
    }
}
