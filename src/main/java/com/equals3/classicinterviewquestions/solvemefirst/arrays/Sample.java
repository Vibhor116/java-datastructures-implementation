package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.io.IOException;
import java.util.Arrays;

public class Sample {

    public static void main(String[] args) throws IOException {
      //
     int arr1 []={1,3,5,7,9,11};
     int arr2 [] = {2,4,6,8,10,12,14,16,18,20};
      
     int arr3[] = new int[arr1.length+arr2.length];
     int i=0;
     int j=0;
     int k=0;
     while(i<arr1.length && j<arr2.length){

      if(arr1[i]<arr2[j]){
        arr3[k++]= arr1[i];
        i++;
      }
      else  if(arr1[i]>arr2[j]){
        arr3[k++]= arr2[j];
        j++;
      }
      // 
     
     }
     while(i<arr1.length){
       arr3[k++] = arr1[i];
       i++;
     }
     while(j<arr2.length){
      arr3[k++] = arr2[j];
      j++;
    }
    System.out.println(Arrays.toString(arr3));
    }

    private static int recursive(int fact) {

     int r=r1(fact-1);
        return r*fact;
        
    }


    private static int r1(int fact) {

     int ress=r2(fact-1);
        return ress*fact;
    }
    
    private static int r2(int fact) {

                return fact;  

       }
    private static void swap(int[] arr, int i, int j) {
        //swap
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       
    }

}
