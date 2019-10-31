package com.interview.arrays.days_1_20;

import java.util.Arrays;

public class MoveAllZerosToEndOfArray{

    public static void main(String[] args) {
        
        int arr[] = {0,0,0,1,2,0,0,5,6,7,0,0};

        MoveAllZerosToEndOfArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void MoveAllZerosToEndOfArray(int[] arr) {

        int flag1 =0;
        int flag2 =0;

        while(flag2<arr.length){
                if(arr[flag2]==0){
                flag2++;
                continue;
                }
            arr[flag1]=arr[flag2];
            flag1++;
            flag2++;
        }
        while(flag1<arr.length){
            arr[flag1++]=0;
        }
        

    }
}