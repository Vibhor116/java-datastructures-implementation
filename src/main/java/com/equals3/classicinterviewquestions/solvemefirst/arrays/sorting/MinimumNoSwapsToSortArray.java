package com.equals3.classicinterviewquestions.solvemefirst.arrays.sorting;

/**
 * https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
 */
public class MinimumNoSwapsToSortArray {

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 4, 6, 5};
        System.out.println(minimumSwaps(arr));
    }

    /**
     *
     * @param arr array, assuming arr has distinct elements and consecutive elements
     * @return minimum number of swaps required to sort
     */
    public static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int i = 0;
        while (i < arr.length) {
            while (arr[i] != (i + 1)) {
                swap(arr, i, arr[i] - 1);
                swaps++;
            }
            i++;
        }
        return swaps;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
