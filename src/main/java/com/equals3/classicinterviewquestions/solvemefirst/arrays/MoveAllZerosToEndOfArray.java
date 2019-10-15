package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.geeksforgeeks.org/move-zeroes-end-array-set-2-using-single-traversal/
 */
public class MoveAllZerosToEndOfArray {

    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 5, 0,0,0, 2, 7, 0, 6, 0, 91,0,1,0,0};
       moveZerosToLast_1(arr);
    }

    private static void moveZerosToLast(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while ((j + 1) < arr.length && arr[j] == 0) {
                if(arr[j+1]==0){
                }
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j++;


            }
        }
        Arrays.stream(arr).forEach(i ->System.out.print(i+ " "));
    }

    private static void moveZerosToLast_1(int[] arr) {

        int left = 0;
        int right = arr.length-1;
        while(left<right){

            if(arr[left]==0){
                if(arr[right]!=0){
                    // swap;
                    int temp =arr[right];
                    arr[right]=0;
                    arr[left]=temp;
                    left++;
                    right--;
                }
                else {
                    while(arr[right]==0){
                        
                        right--;
    
                    }
                    int temp =arr[right];
                        arr[right]=0;
                        arr[left]=temp;
                        left++;
                        right--;
                }
            }  
              else{
                  left++;
              }
               
        }


        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }

}