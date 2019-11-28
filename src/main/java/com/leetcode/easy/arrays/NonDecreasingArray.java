//https://leetcode.com/problems/non-decreasing-array/
//665. Non-decreasing Array

package com.leetcode.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class NonDecreasingArray{

    public static void main(String[] args) throws Exception {
    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    String [] input_Array = br.readLine().split("\\s+");
     int[] final_Array =  new int[input_Array.length];
     for(int i=0;i<final_Array.length;i++){
         final_Array[i]= Integer.parseInt(input_Array[i]);
     }   
     // logic goes here
     
     System.out.println(NonDecreasingArray.checkPossibility(final_Array));
    }
    public static boolean checkPossibility(int[] nums) {
        // input 4 2 3 == 4->1
        // 4 2 1 not possible
        // 1 4 2 3 
        int count=1; // max modifications allowed
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
            continue;
            }
            if(count>0){
                count--;
                if(i==0){
                    continue;
                }
                if(nums[i+1] >= nums[i-1]) {
                    nums[i] = nums[i-1];
                }
                else {
                    nums[i+1] = nums[i];
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}