package com.ctci;

import java.util.Arrays;

public class CheckUniqueChars {

    public static void main(String [] args){
        String  str  ="abcdefgh2131";
      //  System.out.println(isUniqueChars(str));

      int arr [] = {4,5,6,1,2,3,9,8,7};

      int max = arr[0];
      int sec= arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                sec=max;
                max= arr[i];
            }
            else if(sec<arr[i]){
                sec=arr[i];

            }
        }

        System.out.print(max);
        System.out.println(sec);
     
      }


    public static boolean isUniqueChars(String str){
    boolean[] bool_arr = new boolean[256];
    for(int i=0;i<str.length();i++){
        int ascii_val = str.charAt(i);
        if(bool_arr[ascii_val] ==false){
            bool_arr[ascii_val]=true;
        }
        else{
            return false;
        }
    }
    return true;
    }
}
