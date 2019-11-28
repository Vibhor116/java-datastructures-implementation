// Given an array of n elements. Find two elements in the array such that their sum is equal to given element K

package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputArray[] = br.readLine().split("\\s+");
        int finalArray[] = new int[inputArray.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = Integer.parseInt(inputArray[i]);
        }
        Integer K = Integer.parseInt(br.readLine());

        // logic goes here
        bruteForceSolution(finalArray, K);
        sortedSolution(finalArray, K);
        hashedSolution(finalArray,K);
    }

    private static void hashedSolution(int[] finalArray, Integer k) {
        HashSet<Integer> myHashSet = new HashSet<>();
        for(int i=0;i<finalArray.length;i++){
            int temp= k-finalArray[i];
            if(myHashSet.contains(temp)){
                System.out.println(finalArray[i]+"  "+temp);
                return;
            }
            myHashSet.add(finalArray[i]);


        }
    
    }

    // Time Complexity: O(nlogn). If the given array is already sorted then the
    // complexity is O(n). Space Complexity: O(1).
    private static void sortedSolution(int[] finalArray, Integer k) {
        Arrays.sort(finalArray);
        int left = 0;
        int right = finalArray.length - 1;
        for (int i = 0; i < finalArray.length; i++) {

            if (finalArray[left] + finalArray[right] == k) {
                System.out.println("sorted pair found " + finalArray[left] + " == " + finalArray[right]);
                return;
            } else if (finalArray[left] + finalArray[right] > k) {
                right--;
            } else {
                left++;
            }

        }
        System.out.println(" Items not found no such elements");

    }

    // time complexity O(n2) , space complexity O(1)
    private static void bruteForceSolution(int[] finalArray, Integer k) {

        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray.length; j++) {
                if (finalArray[i] + finalArray[j] == k) {
                    System.out.println("pair found " + finalArray[i] + " == " + finalArray[j]);
                    return;
                }
            }
        }
        System.out.println(" Items not found no such elements");
    }
}