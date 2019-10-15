package com.equals3.classicinterviewquestions.solvemefirst.arrays.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of n numbers, give an algorithm for checking whether there are
 * any duplicate elements in the array or no?
 */
public class FindDuplicates {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 9, 10 };
        checkDuplicatsWithHashing(arr);

    }

    // O(N^2) solution
    public static void checkDuplicatesBruteForce(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("dupes found");
                    return;
                }
            }
        }
        System.out.println("no dupes found");
    }

    // O(NlogN) solution
    public static void checkDuplicatesUsingSorting(int arr[]) {

        Arrays.sort(arr);
        // single pass
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("dupes found");
                return;
            }
        }
        System.out.println("no dupes found");
    }
    // hashing solution Time Complexity: O(n). Space Complexity: O(n).


    public static void checkDuplicatsWithHashing(int arr[]) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer value = countMap.get(arr[i]);
                if(value==null){
                    countMap.put(arr[i], 1);
                }
                else{
                    countMap.put(arr[i], value+1);
                }
        }
        for(Map.Entry<Integer,Integer>map:countMap.entrySet()){
            if(map.getValue()>1){
                System.out.println("dupes found");
            }
        }
    }
}