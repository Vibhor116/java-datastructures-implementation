// https://www.geeksforgeeks.org/merge-k-sorted-arrays/

package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeTwoSortedArray{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first_Arr[] = br.readLine().split("\\s+");
        String second_Arr[] = br.readLine().split("\\s+");

        int arr1[]=new int[first_Arr.length];
        int arr2[]=new int[second_Arr.length];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]= Integer.parseInt(first_Arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]= Integer.parseInt(second_Arr[i]);
        }
        // logic goes here
        int arr3[]= new int[arr1.length+arr2.length];
        int m=0;int n=0;int k=0;
        while(m<arr1.length && n<arr2.length){

            if(arr1[m]<arr2[n]){
                arr3[k]=arr1[m];
                m++;
            }
            else{
                arr3[k]=arr2[n];
                n++;
            }
            k++;
                
        }
        while(m<arr1.length){
            arr3[k]=arr1[m];
            m++;
            k++;
        } 
        while(n<arr2.length){
            arr3[k]=arr2[n];
            n++;
            k++;
        } 
        System.out.println(Arrays.toString(arr3));
    }
}