package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.util.Arrays;

// https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
public class ZigZagArrangement {

    public static void main(String[] args) {
        int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
      //  ZigZagArrangement.rearrangeArrayInZigZagForm(arr);
        ZigZagArrangement.rearrangeArrayInZigZagForm_1(arr);
    }

    // Typical O(nlogn) approcah
    private static void rearrangeArrayInZigZagForm(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i = i + 2) {

            if (i < arr.length - 1) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));


    }

    // Better O(n) approach, no sorting required
    private static void rearrangeArrayInZigZagForm_1(int[] arr) {
        boolean flag = true;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            else{
                if (arr[i] < arr[i + 1]) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            // flip flag 
            flag = !flag;
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

    }
}
