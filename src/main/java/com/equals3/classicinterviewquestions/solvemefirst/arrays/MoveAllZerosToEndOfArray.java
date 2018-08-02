package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/move-zeroes-end-array-set-2-using-single-traversal/
 */
public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZerosToLast(arr);
    }

    private static void moveZerosToLast(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while ((j + 1) < arr.length && arr[j] == 0) {
                if(arr[j+1]==0){
                }
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j++;


            }
        }
        System.out.println(Arrays.toString(arr));
    }

}