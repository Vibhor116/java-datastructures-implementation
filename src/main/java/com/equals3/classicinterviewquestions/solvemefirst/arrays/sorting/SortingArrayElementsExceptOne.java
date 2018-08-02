package com.equals3.classicinterviewquestions.solvemefirst.arrays.sorting;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/sorting-array-elements-except-one/
 */
public class SortingArrayElementsExceptOne {
    public static void main(String[] args) {
        int arr[] = {10, 4, 11, 7, 6, 20};
        int index = 2;
        sortingArrayExceptOne(arr, index);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr
     * @param index
     */
    private static void sortingArrayExceptOne(int[] arr, int index) {
        swap(arr, index, arr.length - 1);
        Arrays.sort(arr, 0, arr.length - 1);
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length-1; i >index; i--) {
             arr[i] = arr[i-1];
        }
        arr[index] = lastElement;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
