package com.equals3.classicinterviewquestions.solvemefirst.arrays.sorting;

import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class MinimumSwapsRequiredToMakeTwoArraysIdentical{

    //Space Complexity: O(1), need extra memory to swap the values.

 ///Time Complexity: O(n2), where n is the size of array.
    public static void main(String[] args) {
        
        int arr1[] = {3, 6, 4, 8}; 
        int arr2[] = {4, 6, 8, 3}; 
       
        int count =0;
        
        if(arr1.length !=arr2.length){
            throw new RuntimeException("");
        }
        for(int i=0;i<arr1.length;i++){
            
            if(arr1[i]!=arr2[i]){

                int j=i;
                while(arr1[i]!= arr2[j]){
                    j++;
                    if (j >= arr2.length)
                    {
                        throw new RuntimeException("Array elements are different.");
                    }
                }
                
            }

        }


    }
}