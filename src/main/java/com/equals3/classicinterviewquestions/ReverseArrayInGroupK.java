package com.equals3.classicinterviewquestions;

import java.util.Arrays;

public class ReverseArrayInGroupK {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        System.out.println(Arrays.toString(reverseArrayGroupK(arr, k)));
    }

    public static int[] reverseArrayGroupK(int[] arr, int k) {

        for (int i = 0; i < arr.length; i = i + k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            while (left < right) {
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
