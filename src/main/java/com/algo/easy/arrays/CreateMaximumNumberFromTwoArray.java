//https://leetcode.com/problems/create-maximum-number/

package com.algo.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CreateMaximumNumberFromTwoArray{


    public static void main(String[] args) throws Exception {
        // input two arrays and K
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input_Array_1 = br.readLine().split("\\s+");
        int[] final_Array_1 = new int[input_Array_1.length];

        for (int i = 0; i < final_Array_1.length; i++) {
            final_Array_1[i] = Integer.parseInt(input_Array_1[i]);
        }
        
        String[] input_Array_2 = br.readLine().split("\\s+");
        int[] final_Array_2 = new int[input_Array_2.length];

        for (int i = 0; i < final_Array_2.length; i++) {
            final_Array_2[i] = Integer.parseInt(input_Array_2[i]);
        }
        Integer K = Integer.parseInt(br.readLine());
        maxNumber(final_Array_1, final_Array_2, K);
    }
    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        
    }
}