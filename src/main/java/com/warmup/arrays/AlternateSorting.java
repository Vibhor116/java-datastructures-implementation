//https://www.geeksforgeeks.org/alternative-sorting/

package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlternateSorting{

    public static void main(String[] args) throws Exception{

        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = br.readLine().split("\\s+");
        int final_Array []=  new int[inputArray.length];
        
        for(int i=0;i<final_Array.length;i++){
            final_Array[i]= Integer.parseInt(inputArray[i]);
        }
        // logic here goes
        sortedSolution(final_Array);


    }

    private static void sortedSolution(int[] final_Array) {
        Arrays.sort(final_Array);

        int left =0;
        int right = final_Array.length-1;
        // 1 2 3 4 5 6 7 8
        while(left<right){
        System.out.print(final_Array[right--]+" ");
        System.out.print(final_Array[left++]+" ");

        }

    }
    
}

