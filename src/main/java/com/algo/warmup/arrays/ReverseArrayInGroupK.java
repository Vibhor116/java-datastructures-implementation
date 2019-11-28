// Reverse array in Group of K

package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArrayInGroupK{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputArray[] = br.readLine().split("\\s+");
        int finalArray[] = new int[inputArray.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = Integer.parseInt(inputArray[i]);
        }
        // logic goes here
       int left=0;
       int right =finalArray.length-1;
       int groupK=3;
       for(int i=0;i<finalArray.length;i=i+groupK){
           left= i;
           right = Math.min(i+groupK-1, finalArray.length-1);
           System.out.println(left+" "+right);
           while(left<right){
               swap(finalArray,left++,right--);
           }
       }
       System.out.println(Arrays.toString(finalArray));
    }

    private static void swap(int[] finalArray, int i, int j) {
        int temp  = finalArray[i];
        finalArray[i]=finalArray[j];
        finalArray[j]=temp;
    }
}