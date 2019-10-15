package com.hackerrank.challenges.arrays;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 */
public class RotateArray {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int number = 3;

        leftRotateArray_solution1(arr, number);
        leftRotateArray_solution3(arr, number);

    }

    private static void leftRotateArray_solution1(int[] arr, int number) {

        for (int i = 0; i < number; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr.length > (j + 1)) {
                    arr[j] = arr[j + 1];
                }
            }
            arr[arr.length - 1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateArray_solution2(int[] arr, int number) {
        int n = arr.length;
        int new_Arr[] =  new int[n];
        System.arraycopy(arr, number, new_Arr, 0, n - number);
        System.arraycopy(arr, 0, new_Arr, n - number, number);
        System.out.println(Arrays.toString(new_Arr));
    }
    

    private static void leftRotateArray_solution3(int[] arr, int number) {
        int n = arr.length;
        int new_Arr[] =  new int[n];
        for(int i=0;i<n;i++){
            if((i-number)<0)
                new_Arr[n+i-number]=arr[i];
            else
                new_Arr[i-number]=arr[i];
        }
 
   
        System.out.println(Arrays.toString(new_Arr));
    }
    
}