package com.hackerrank.practice.algorithims.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class XorAndInsert{

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number_Of_testCases =  Integer.parseInt(br.readLine());

        HashSet<Integer> mySet=new HashSet<>();
        for(int i=0;i<number_Of_testCases;i++){
            String[] arr=  br.readLine().split("\\s+");
            int localMin=0;
            for(int k=0;k<arr.length;k++){
               if(Integer.parseInt(arr[0])==3){
                //print minimum of sets
                System.out.println(localMin);
               } 
               if(Integer.parseInt(arr[0])==1){
                   // add x to test
                   int x = Integer.parseInt(arr[1]);
                    mySet.add(x);

               }
               if(Integer.parseInt(arr[0])==2){
                // xor it
                int x = Integer.parseInt(arr[1]);

                for(Integer s:mySet){
                    // s xor x
                    int result = s^x;
                    mySet.
                }
                
            }
            }
        }

    }
}