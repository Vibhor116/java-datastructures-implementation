package com.equals3.classicinterviewquestions.solvemefirst.arrays;

/**
 * https://www.geeksforgeeks.org/find-second-largest-element-array/
 */
public class FindFirstAndSecondMaximumInArray {

    public static void main(String[] args) {

        Integer arr[] = {3, 6, 9, 1, 8, 19, 2, 5, 11,13,15,10};
        int result[] =findFirstAndSecondMaximum(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }


    public static int[] findFirstAndSecondMaximum(Integer arr[]){

        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if(secondMax < arr[i] && arr[i]!= firstMax){
                secondMax=arr[i];
            }

        }
        return new int[]{firstMax,secondMax};
    }

}
