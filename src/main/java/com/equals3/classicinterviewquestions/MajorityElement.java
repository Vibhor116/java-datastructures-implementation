package com.equals3.classicinterviewquestions;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 4, 1, 5};
        System.out.println(findMajorityBruteForce(arr));
    }

    private static int findMajorityBruteForce(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if(elem==arr[j]){
                    count++;
                }
            }
            if(count>=arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}
