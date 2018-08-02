package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/majority-element/
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 4, 1, 5};
        System.out.println(findMajorityBruteForce(arr));
    }

    /**
     * Brute force approach,O(n^2) time complexity
     *
     * @param arr
     * @return Majority element
     */
    private static int findMajorityBruteForce(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (elem == arr[j]) {
                    count++;
                }
            }
            if (count >= arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    /**
     * Use Hashing to Store Key/Value Pair,O(n) time/space complexity
     *
     * @param arr
     * @return
     */
    public static int findMajorityHashing(int arr[]) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer value = hashMap.get(arr[i]);
            if (value != null) {
                hashMap.put(arr[i], value + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {

            if (map.getValue() > arr.length / 2) {
                return map.getKey();
            }

        }

        return -1;


    }

    /**
     * Use Sorting and then count ,O(nlogn) time and O(1) space complexity
     * @param arr
     * @return MajorityElement
     */
    public static int findMajorityUseSorting(int arr[]) {

        Arrays.sort(arr);
        int count = 1;
        int x= arr[0];
        for(int i =1;i<arr.length;i++){
            if(x==arr[i]){
                count++;
                if(count>arr.length/2){
                    return arr[i];
                }
            }
            else{
                x= arr[i];
                count =1;
            }
        }
        return -1;
    }

}
