package com.equals3.classicinterviewquestions.solvemefirst.arrays.sorting;

import java.util.Arrays;
import java.util.concurrent.Executors;

public class ZigZagArrangement{

    public static void main(String[] args) {
        
        int arr[]= {4, 3, 7, 8, 6, 2, 1};
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int k=1;k<arr.length-1;k=k+2){
            int j=k+1;
            swap(arr,k,j);
          
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int k, int j) {
        int temp=arr[k];
        arr[k]=arr[j];
        arr[j]=temp;
        Executors
    }
}