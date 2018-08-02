package com.ctci;


import java.util.Arrays;

public class AA {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int k =2;
        for(int j=0;j<k;j++){

            int temp  =arr[0];
            for(int i=0;i<arr.length;i++){
                if((i+1)<arr.length)
                    arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;


        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int k) {

        int temp  =arr[0];
        for(int i=0;i<arr.length;i++){
            if((i+1)<arr.length)
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;


    }
}
