package org.g4g.problems.arrays;

import java.util.Map;

//Sliding Window Maximum (Maximum of all subarrays of size k)
// using stack in O(n) time
public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int arr[] = { 9, 7, 2, 4, 6, 8, 2, 1, 5 };
        int k = 3;
        getMaximumElementInSlidingWindow(arr, k);

    }

    // brute force approach
    private static void getMaximumElementInSlidingWindow(int[] arr, int k) {
        int calculate_Maximum = 0;
        int stopAt = arr.length - k;
        
        for (int i = 0; i <= stopAt; i++) {
            calculate_Maximum = arr[i];
            for (int j = i; j < i + k; j++) {
                if (calculate_Maximum < arr[j]) {
                    calculate_Maximum = arr[j];
                }
            }
            System.out.println(calculate_Maximum);
           
        }

    }



}