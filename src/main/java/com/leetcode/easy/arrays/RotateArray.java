//https://leetcode.com/problems/rotate-array/

package com.leetcode.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArray{

    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer k = Integer.parseInt(br.readLine());
    String [] input_Array = br.readLine().split("\\s+");
    int[] final_Array =  new int[input_Array.length];
    for(int i=0;i<final_Array.length;i++){
        final_Array[i]= Integer.parseInt(input_Array[i]);
    }  
    RotateArray.rotate(final_Array, k);
System.out.println(Arrays.toString(final_Array));
    }

    public static void rotate(int[] nums, int k) {
       // 1 2 3 4 5
       // 4 5   1 2 3
    
        while(k>0){
            int temp=nums[0];
            int i=0;
            for( i =0;i<nums.length-1;i++){
              nums[i]=nums[i+1];
                
            }
          nums[nums.length-1]=temp;
            k--;
        }
       
    }
}