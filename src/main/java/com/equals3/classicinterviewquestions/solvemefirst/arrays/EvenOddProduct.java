package com.equals3.classicinterviewquestions.solvemefirst.arrays;

//https://www.geeksforgeeks.org/program-to-print-product-of-even-and-odd-indexed-elements-in-an-array/
public class EvenOddProduct {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        EvenOddProduct.EvenOddProduct(arr);
    }

    private static void EvenOddProduct(int[] arr) {
        int evenProduct=1;
        int oddProduct=1;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                //even
                evenProduct=evenProduct*arr[i];
            }
            else{
                //odd
                oddProduct=oddProduct*arr[i];
            }
        }
        System.out.println(evenProduct);
        System.out.println(oddProduct);
    }

}