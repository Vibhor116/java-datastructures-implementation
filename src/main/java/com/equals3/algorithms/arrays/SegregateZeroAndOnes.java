package com.equals3.algorithms.arrays;

import java.util.Arrays;

public class SegregateZeroAndOnes {
    public static void main(String [] args){

        int arr[] ={1,0,1,0,1,0,1,0,1};
        SegregateZeroAndOne(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void SegregateZeroAndOne(int[] arr) {
        int left =0;
        int right = arr.length-1;
        while(left<right){

            while(arr[left]==0){
                left++;
            }
            while(arr[right]==1){
                right--;
            }
            if(left<right){

                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
        }
    }
}
