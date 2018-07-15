package com.equals3.algorithms.arrays;

import java.util.Arrays;

public class SegregateOddEvenNumbers {

    public static  void segregateOddEvenNumbers(int [] arr){

        int left =0;
        int right  = arr.length-1;
        while(left<right){

            while(arr[left] %2 ==0){
                left++;
            }
            while(arr[right] %2 !=0){
                right--;
            }
        if(left<right){
            swap(arr,left++,right--);
        }

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    public static  void main(String[]  args){

        int []  arr  =  new int[]{1,2,3,4,5,6,7,8};
        segregateOddEvenNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }

}
