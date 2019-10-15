package com.ctci;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int arr[] = { 2, 2, 1, 3, 1, 1, 1 };
        Arrays.sort(arr);
        int k = 2;
        int flag = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] == arr[i + 1]) {
                    flag = flag + 1;
                } else {
                }

            }
            System.out.println(flag);
            // flag=1;

        }

    }

}