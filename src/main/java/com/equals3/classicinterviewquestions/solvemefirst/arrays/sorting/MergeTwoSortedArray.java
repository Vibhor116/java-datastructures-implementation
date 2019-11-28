package com.equals3.classicinterviewquestions.solvemefirst.arrays.sorting;

import java.util.Arrays;

public class MergeTwoSortedArray{

    public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20};
        int arr2[] = {2, 3, 8, 13};
        int f=0;
        for(int i=0;i<arr1.length;i++){

            for(int j=arr2.length-1;j>=0;j--){
                // compare and swap
                if(arr2[j]<arr1[i])
                {
                   f=arr2[j];
                    arr2[j]=arr1[1];
                    arr1[i]=f;
                }

            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}