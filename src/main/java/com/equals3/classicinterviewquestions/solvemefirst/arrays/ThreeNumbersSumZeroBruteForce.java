package com.equals3.classicinterviewquestions.solvemefirst.arrays;

public class ThreeNumbersSumZeroBruteForce {

    public static void main(String[] args) {
        int arr [] = { 3,-1,-7,-4,-5,9,10};

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(" "+arr[k]);
                }
                System.out.println();
            }
        }
    }
}
