

package com.warmup.arrays;

import java.util.Arrays;

public class MoveAllZerosToEndOfArray{

    public static void main(String[] args) {
        
        int arr[] = {0,0,0,3,1,0,0,12,54,7,0,0,1,0};
        
        int f=0;
        int f1=0;
        while(f1<arr.length){
            if(arr[f1]==0){
                f1++;
                continue;
            }
             arr[f]= arr[f1];
             f1++;
             f++;
        }
        System.out.println(Arrays.toString(arr));
    }
}