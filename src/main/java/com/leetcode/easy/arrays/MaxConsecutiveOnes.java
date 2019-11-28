//https://leetcode.com/problems/max-consecutive-ones/

package com.leetcode.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxConsecutiveOnes {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inpStrings = br.readLine().split("\\s+");
        int[] finalArr = new int[inpStrings.length];
        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = Integer.parseInt(inpStrings[i]);
        }
      int r =  MaxConsecutiveOnes.findMaxConsecutiveOnes(finalArr);
//   System.out.println(r);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max=0;
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                temp++;
                if(max<temp){
                    max=temp;
                }

            }
            else{
               
                temp=0;
             
            }
        }
        System.out.println(max);
        return max;
    }
}