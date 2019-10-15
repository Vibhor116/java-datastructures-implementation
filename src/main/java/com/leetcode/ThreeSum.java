package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4, -1, 0, 1, 2, -1, -4, -1, 0, 1, 2, -1, -4, -1, 0, 1, 2, -1, -4, -1, 0, 1, 2,
                -1, -4, -1, 0, 1, 2, -1, -4, -1, 0, 1, 2, -1, -4, -1, 0, 1, 2, -1, -4 };

        System.out.println(calculateThreeSum(arr));
    }

    private static List<List<Integer>> calculateThreeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr.length < 3) {
            return result;
        }
        Arrays.sort(arr);
        for(int i = 0, l = arr.length; i < l - 2; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) { 
                int j = i + 1, k = l - 1;
                while (k > j) {
                    if (j != i + 1 && arr[j] == arr[j - 1]) { // avoid dupes
                        j++;
                        continue;
                    }
                    int sum = arr[i] + arr[j] + arr[k];// found sum
                    if (sum == 0) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                        k--;
                        j++;
                    }
                     else if (sum > 0){
                        k--;
                     }
                       
                    else{
                        j++;
                    }
                }
            }
        }
        return result;
    }
}