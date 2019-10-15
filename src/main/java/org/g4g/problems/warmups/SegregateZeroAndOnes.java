package org.g4g.problems.warmups;

import java.util.Arrays;

public class SegregateZeroAndOnes {

    public static void main(String[] args) {
        
        int arr[] = {1,0,1,0,1,0,1,1};
        int result[] =SegregateZeroAndOnes_TwoPointer(arr);
        System.out.println(Arrays.toString(result));
    }

    // brute force approach
    private static int[] SegregateZeroAndOnes(int[] arr) {
        int count_Zeros =0;
        int count_Ones = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count_Zeros++;
            }
        }
        count_Ones=arr.length-count_Zeros;
        for(int i=0;i<count_Zeros;i++){
            arr[i]=0;
        }
        for(int j=count_Zeros;j<arr.length;j++){
            arr[j]=1;
        }
       
        return arr;
    }

    // two pointer technique
    private static int[] SegregateZeroAndOnes_TwoPointer(int[] arr) {
        int left =0;
        int right = arr.length-1;

        while (left<right) {
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
        
        return arr;

    }

}