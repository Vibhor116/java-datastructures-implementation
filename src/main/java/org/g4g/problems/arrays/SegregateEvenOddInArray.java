package org.g4g.problems.arrays;


import java.util.Arrays;

/**
 *
 */
public class SegregateEvenOddInArray {

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,0,0,0,1,1,0};

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] ==1) {
                left++;

            }
            while (arr[right] == 0) {
                right--;
            }
            if (left < right) {

                swap(arr,left++,right--);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j) {
        int temp =  arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
}
