package org.g4g.problems.arrays;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/
 */
public class ReverseArrayInGroupK {

    public static void main(String[] args) {
        int k = 3;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 ,15,16};
        reverseArrayInGroupK(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArrayInGroupK(int[] arr, int k) {
        int len = arr.length;
        for (int i = 0; i < len; i = i + k) {
            int left = i;
            int right = Math.min(i + k - 1, len - 1);
            while (left < right) {
                swap(arr, left++, right--);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
