//Given an array of n numbers. Give an algorithm for finding the element which appears the maximum number of times in the array?

package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindMaximumOccurenceInArray {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputArray[] = br.readLine().split("\\s+");
        int finalArray[] = new int[inputArray.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = Integer.parseInt(inputArray[i]);
        }
        // logic goes here
        bruteForceSolution(finalArray);

    }

    private static void bruteForceSolution(int[] finalArray) {
        int max=0;
        int count=0;
        for(int i=0;i<finalArray.length;i++){
            count=0;
            for(int j=i+1;j<finalArray.length;j++){
                if(finalArray[i]==finalArray[j]){
                    count++;
                }
            }
           if(count>max){
            max=count;               

           }

        }
        System.out.println(max);
    }

}