package com.equals3.algorithms.arrays.search;

public class BinarySearch {

    public static int find(int backingArray[], int searchKey) {
        int lowerBound = 0;
        int upperBound = backingArray.length - 1;
        int curruntIndex;
        while (lowerBound <= upperBound) {
            curruntIndex = (lowerBound + upperBound) / 2;
            if (backingArray[curruntIndex] == searchKey) {
                return curruntIndex;
            } else {
                if (backingArray[curruntIndex] < searchKey)
                    lowerBound = curruntIndex + 1; // it in upper half
                else if (backingArray[curruntIndex] > searchKey)
                    upperBound = curruntIndex - 1; // its in lower half
            }

        }
        // fallback case
        return -1;
    }

    public static int recursiveBinarySearch(int arr[], int item, int left, int right) {

        if(left<=right){
        int mid = (left + right) / 2;

        if (arr[mid] == item) {
            return mid;
        }
        else if (arr[mid] > item) {
            return recursiveBinarySearch(arr, item, left, mid - 1);
        } else if (arr[mid] < item) {
            return recursiveBinarySearch(arr, item, mid + 1, right);
        }
    }
        return -1;
    
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 10, 14, 44, 77, 78, 99 };
        int result = BinarySearch.find(arr, 44);
        int recursiveBinarySearch = BinarySearch.recursiveBinarySearch(arr, 78, 0, arr.length - 1);
        System.out.println(result);
        System.out.println(recursiveBinarySearch);

    }
}