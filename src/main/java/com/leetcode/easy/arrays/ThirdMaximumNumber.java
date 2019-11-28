//https://leetcode.com/problems/third-maximum-number/
//414

package com.leetcode.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdMaximumNumber {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input_Array = br.readLine().split("\\s+");
        int[] final_Array = new int[input_Array.length];
        for (int i = 0; i < final_Array.length; i++) {
            final_Array[i] = Integer.parseInt(input_Array[i]);
        }
        System.out.println(ThirdMaximumNumber.thirdMax(final_Array));

    }

    public static int thirdMax(int[] nums) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        if (nums.length < 3) {
            thirdMax = secondMax;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
            } 
            else if (nums[i] > secondMax && nums[i] != firstMax) {
                thirdMax=secondMax;
                secondMax = nums[i];
            }
            else if (nums[i] > thirdMax && nums[i] != secondMax) {
                thirdMax = nums[i];
            }

        }
        System.out.println(firstMax + " " + secondMax+"  "+thirdMax);
        return thirdMax;
    }
}