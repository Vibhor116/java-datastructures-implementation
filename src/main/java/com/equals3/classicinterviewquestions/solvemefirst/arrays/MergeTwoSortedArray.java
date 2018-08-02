package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/merge-two-sorted-arrays/
 */
public class MergeTwoSortedArray {


    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7, 9,11};
        int arr2[] = {2, 4, 6, 8, 10,12,14};
        mergeTwoSortedArray(arr1, arr2);
    }

    private static void mergeTwoSortedArray(int[] arr1, int[] arr2) {

        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {


            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));

    }
}
