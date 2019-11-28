package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SegregrateEvenAndOdd{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputArray[] = br.readLine().split("\\s+");
        int finalArray[] = new int[inputArray.length];
        for(int i=0;i<finalArray.length;i++){
            finalArray[i]= Integer.parseInt(inputArray[i]);
        }
        // logic goes here
        int left =0;
        int right = finalArray.length-1;
        while(left<right){

            while(finalArray[left]%2==0){
                left++;
            }
            while(finalArray[right]%2!=0){
                right--;
            }
            if(left<right){
                // swap
                int temp = finalArray[left];
                finalArray[left]=finalArray[right];
                finalArray[right]=temp;
                left++;
                right--;

            }
        }
        System.out.println(Arrays.toString(finalArray));
        
    }
}