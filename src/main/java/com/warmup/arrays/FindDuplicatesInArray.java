//Given an array of n numbers, give an algorithm for checking whether there are any duplicate elements in the array or no?

package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindDuplicatesInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputArray[] = br.readLine().split("\\s+");
        int finalArray[] = new int[inputArray.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = Integer.parseInt(inputArray[i]);
        }
        // logic goes here
        bruteForceSolution(finalArray);
        checkSortedSolution(finalArray);
           


    }
    //Time Complexity: O(nlogn), for sorting. Space Complexity: O(1)
    private static void checkSortedSolution(int[] finalArray) {
        Arrays.sort(finalArray);
        for(int i=0;i<finalArray.length;i++){
            if(i<finalArray.length-1 && finalArray[i]==finalArray[i+1]){
                System.out.println("duplicates found=="+finalArray[i]);
                return;
            }
        }
        System.out.println("no duplicates found");

    }

    // Time Complexity: O(n2), for two nested for loops. Space Complexity: O(1)
    private static void bruteForceSolution(int[] finalArray) {
        int[] arr = Arrays.copyOf(finalArray, finalArray.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (arr[i] == arr[j]) {
                        System.out.println("duplicates found==" + arr[i]);
                        return;
                    }
                }
            }
        }
    System.out.println(" no duplicates found");
    }
}