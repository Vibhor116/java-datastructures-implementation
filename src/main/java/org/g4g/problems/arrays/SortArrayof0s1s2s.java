package org.g4g.problems.arrays;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */
public class SortArrayof0s1s2s {

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        sortArray(arr);
    }

    public static int[] sortArray(int arr[]) {

        int left = 0;
        int right = arr.length - 1;
        int index = 0;
        int temp = 0;
        while (index <= right) {
            switch (arr[index]) {
                case 0:
                    swap(arr, index, left);
                    left++;
                    index++;

                    break;

                case 1:
                    index++;
                    break;

                case 2:
                    swap(arr, index, right);
                    right--;
                    break;
            }
            System.out.println(Arrays.toString(arr));

        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
