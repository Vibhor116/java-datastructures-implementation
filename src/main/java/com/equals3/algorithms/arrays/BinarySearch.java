package com.equals3.algorithms.arrays;

public class BinarySearch {

    private int[] backingArray;
    private int nItems;

    public BinarySearch(int size) {
        backingArray = new int[size];
        nItems = 0;
    }

    public int find(int searchKey) {
        int lowerBound = 0;
        int upperBound = nItems - 1;
        int curruntIndex;
        while (true) {
            curruntIndex = (lowerBound + upperBound) / 2;
            if (backingArray[curruntIndex] == searchKey) {
                return curruntIndex;
            } else {
                if (backingArray[curruntIndex] < searchKey)
                    lowerBound = curruntIndex + 1; // it in upper half
                else
                    upperBound = curruntIndex - 1; // its in lower half
            }
        }


    }

    public static int recursiveBinarySearch(int arr[], int item, int left, int right) {

        int mid = (left + right) / 2;

        if (arr[mid] == item) {
            return mid;
        }
        if (left > right) {
            return -1;
        } else if (arr[mid] > item) {
            return recursiveBinarySearch(arr, item, left, mid - 1);
        } else if(arr[mid] < item) {
            return recursiveBinarySearch(arr, item, mid + 1, right);

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 14, 44, 77, 78, 99};
        int result = recursiveBinarySearch(arr, 10, 0, arr.length - 1);
        System.out.println(result);
    }
}
