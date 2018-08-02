package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.util.Arrays;

public class SegregateEvenOdd {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(segregateEvenOddArray(arr)));
    }

    private static int[] segregateEvenOddArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0) {
                left++;
            }
            while (arr[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                swap(arr, left++, right--);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
