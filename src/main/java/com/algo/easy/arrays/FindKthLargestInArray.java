// find Kth Larest Element in array

package com.algo.easy.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindKthLargestInArray {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input_Array = br.readLine().split("\\s+");
        int[] final_Array = new int[input_Array.length];

        for (int i = 0; i < final_Array.length; i++) {
            final_Array[i] = Integer.parseInt(input_Array[i]);
        }
        Integer K = Integer.parseInt(br.readLine());

        int result =kthLargestElementInArray(final_Array,K);
        System.out.println(result);
    }

    // using quickselect of quick sort in O(nlogn) time
    private static int kthLargestElementInArray(int[] final_Array , int k) {
        int left = 0;
        int right = final_Array.length - 1;
        int position=0;
        while(true){
            position = quickSelect(final_Array,left,right);
            if(position==k+left){
                return final_Array[position];
            }
            if(position>k+left){
                right=position-1;
            }
            else{
                k = k - (position - left + 1);
                left = position+1;

            }
        }

    }

    private static int quickSelect(int[] final_Array, int left, int right) {
       int pivot =left;
       left++;
       while(left<=right){
           if(final_Array[pivot]>final_Array[left]){
            left++;
            continue;
           }
           if(final_Array[pivot]<=final_Array[right]){
            right--;
            continue;
           }
            swap(final_Array, left, right);
        }
        if(final_Array[right]<final_Array[pivot]){
            swap(final_Array, pivot, right);
        }
        return right;
    }

    private static void swap(int final_Array[], int i, int j) {
        int temp = final_Array[i];
        final_Array[i] = final_Array[j];
        final_Array[j] = temp;
    }
}