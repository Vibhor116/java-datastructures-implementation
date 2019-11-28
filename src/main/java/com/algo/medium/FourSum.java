//https://leetcode.com/problems/4sum/

package com.algo.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum{

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input_Arr_1= br.readLine().split("\\s+");

        Integer final_Arr_1[] = new Integer[input_Arr_1.length];

        for(int i=0;i<final_Arr_1.length;i++){
            final_Arr_1[i]=Integer.parseInt(input_Arr_1[i]);
        }
        int target = Integer.parseInt(br.readLine());
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(final_Arr_1, target);
        result.forEach(System.out::print);
    }

    // time complexity O(n^3)
    private List<List<Integer>> fourSum(Integer[] final_Arr_1, int target) {
       
        if (final_Arr_1.length < 4) {
            return Collections.emptyList();
        }
        Arrays.sort(final_Arr_1);
        // -2 -1 0 0 1 2
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < final_Arr_1.length - 3; i++) {
            if(final_Arr_1[i] + final_Arr_1[i+1] + final_Arr_1[i+2] + final_Arr_1[i+3] > target) {
                break;
            }
            if (i != 0 && final_Arr_1[i] == final_Arr_1[i - 1]) {
                continue;
            }
            if(final_Arr_1[i] + final_Arr_1[final_Arr_1.length - 3] + final_Arr_1[final_Arr_1.length - 2] + final_Arr_1[final_Arr_1.length - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < final_Arr_1.length - 2; j++) {
                if (j != i + 1 && final_Arr_1[j] == final_Arr_1[j - 1]) {
                    continue;
                }
                if (final_Arr_1[i] + final_Arr_1[j] + final_Arr_1[j + 1] + final_Arr_1[j + 2] > target) {
                    break;
                }
                if (final_Arr_1[i] + final_Arr_1[j] + final_Arr_1[final_Arr_1.length - 1] + final_Arr_1[final_Arr_1.length - 1] < target) {
                    continue;
                }
            } 
        }
        return result;
    }
}