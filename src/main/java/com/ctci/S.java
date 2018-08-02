package com.ctci;

import java.util.Arrays;

public class S {

    public static void main(String[] args) {

        int arr[] =  {0,0,0,1,2,3,4,0,0,5,670,0};
        int count =0;
        int temp;
        for(int  i =0;i<arr.length;i++){

            if(arr[i]!=0){
                temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count=count+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
