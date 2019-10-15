package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.util.Arrays;

//Kth Largrest element of an array
public class KthElementInArray {

    public static void main(String[] args) {
        int arr[] ={2,3,11,4,9,8,7,6 };
        KthElementInArray kthElement = new KthElementInArray();
        System.out.print(kthElement.findKthLargestElement(arr, 3));
       // Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }

    private  int findKthLargestElement(int[] arr,int k) {
        int low = 0;
        int high = arr.length-1;
        int pos =0;
        while(true){
            pos = quickSelect(arr,low,high);
            if(pos == (k+low)){
                return arr[pos];
            }
            if(pos > k + low){
                high = pos-1;
            }else{
                k = k - (pos - low + 1);
                low = pos+1;
            }
        }
    }

    private int quickSelect(int arr[],int i,int j){
        int pivot = i;
        i++;
        while(i <= j){
            if(arr[pivot] > arr[i]){
                i++;
                continue;
            }
            if(arr[pivot] <= arr[j]){
                j--;
                continue;
            }
            swap(arr,i,j);
        }
        if(arr[j] < arr[pivot]){
            swap(arr,pivot,j);
        }
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}