package com.equals3.classicinterviewquestions.solvemefirst.arrays.searching;


/**
 * https://www.geeksforgeeks.org/count-1s-sorted-binary-array/
 * Given a binary array sorted in non-increasing order, count the number of 1’s in it.
 */
public class Count1sSortedBinaryArray {
    public static void main(String[] args) {
        int arr[] = {1, 0};
        // linear search will have O(n) tme complexity
        //  We can use binary search for O(logn) complexity
        System.out.println(count1sSortedBinaryArray(arr));
    }

    private static int count1sSortedBinaryArray(int[] arr) {
        int count = 0;

        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        // search for last index viz. have element as 1
        //  works only when there should be at least single 1
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == 0) {
                right = mid - 1;
            } else if (arr[mid] == 1) {
                left = mid + 1;
                // boundary condition
                if (mid < arr.length - 1 && arr[mid + 1] == 0) {
                    return mid + 1;
                }
            }


        }
        return mid + 1;
    }
}
