package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        calculateTwoSum_BruteForce(arr, target);
        System.out.println(Arrays.toString(calculateTwoSum_TwoPass_HashTable(arr, target)));

    }

   

    // Approach 1: Brute Force
    private static int[] calculateTwoSum_BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    // Approach 2: Two pass hash table
    private static int[] calculateTwoSum_TwoPass_HashTable(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                return new int[]{i,map.get(diff)};
            }
        
           
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}