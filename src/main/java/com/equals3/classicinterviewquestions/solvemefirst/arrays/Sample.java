package com.equals3.classicinterviewquestions.solvemefirst.arrays;

import java.io.IOException;

public class Sample {

    public static void main(String[] args) throws IOException {

      
      
      char ch ='Z';
      int offset =  ch+4;
      System.out.println(offset);
      System.out.println(offset-65);
      System.out.println((offset-65)%26+offset);
       

  
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
