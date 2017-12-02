package com.equals3.algorithms.strings;

import java.util.Arrays;

public class CountElementsInArray {
public static void main(String[] args) {
	int a[]={3, 1, 2, 2, 1, 2, 3, 3,3,4,1,2,3,4};
   Arrays.sort(a);

    int nbOccurences = 1;
    int length= a.length;
    for (int i = 0; i < length; i++) {
        if (i < length - 1) {
            if (a[i] == a[i + 1]) {
                nbOccurences++;
            }
        } else {
            System.out.println(a[i] + " occurs " + nbOccurences
                    + " time(s)"); //end of array
        }

        if (i < length - 1 && a[i] != a[i + 1]) {
            System.out.println(a[i] + " occurs " + nbOccurences
                    + " time(s)"); //moving to new element in array
            nbOccurences = 1;
        }

    }
}
}