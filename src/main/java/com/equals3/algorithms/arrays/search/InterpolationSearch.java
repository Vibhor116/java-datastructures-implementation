package com.equals3.algorithms.arrays.search;

public class InterpolationSearch {

    public static int findElement(int arr[] ,int element){

        int left =0;
        int right = arr.length-1;
        int pos  = 0;
        while (left<=right && element <= arr[right] && element >= arr[left]) {
            // uniform distribution in mind. 
             pos = left + (((right-left) / 
                  (arr[right]-arr[left]))*( element- arr[left])); 
            if(arr[pos]== element){
                return pos;
            }
            else{
                if(arr[pos]>element){
                right=pos-1;
                }
                else{
                    left= pos+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int interpolationSearch_Result = InterpolationSearch.findElement(arr, 10);
        System.out.println(interpolationSearch_Result);
    }
}