package org.g4g.problems.warmups;

public class MaximumElement {

    public static void main(String[] args) {

        int arr[] = { 7,10,13, 9, 3, 2, 1, 4, 5, 45, 6 };

        int maximumElement = arr[0];
        int secondMax=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximumElement) {
                secondMax=maximumElement;
                maximumElement = arr[i];
               
            }
            else if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println(maximumElement);
        System.out.println(secondMax);

    }

}