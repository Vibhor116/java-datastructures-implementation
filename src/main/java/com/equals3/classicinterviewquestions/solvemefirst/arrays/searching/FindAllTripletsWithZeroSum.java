package com.equals3.classicinterviewquestions.solvemefirst.arrays.searching;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/
 * Given an array with distinct elements  find triplets in array whose sum = 0
 */
public class FindAllTripletsWithZeroSum {

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        findAllTripletsWithZeroSum_M1(arr);
        findAllTripletsWithZeroSum_M2(arr);
    }

    /**
     * typical O(n^3) complexity approach
     *
     * @param arr
     */
    private static void findAllTripletsWithZeroSum_M1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    /** O(n^2) time complexity
     * @param arr
     */
    private static void findAllTripletsWithZeroSum_M2(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {

            int left = i + 1;
            int right = arr.length - 1;
            int x = arr[i];
            while (left < right) {
                if (x + arr[left] + arr[right] == 0) {
                    // find it
                    System.out.println(x + " " + arr[left] + " " + arr[right]);
                    left++;
                    right--;

                } else if (x + arr[left] + arr[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}