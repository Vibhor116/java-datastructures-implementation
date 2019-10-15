package com.equals3.classicinterviewquestions.solvemefirst.arrays;

//rignoyamla@enayu.com
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;

public class Sample {

    public static void main(String[] args) throws IOException {

      int arr[]={1,2,3,4};

      for(int i=0;i<arr.length;i++){

        for(int j=i;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
      }

      
      
       

  
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
