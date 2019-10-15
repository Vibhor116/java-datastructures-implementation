package com.hackerrank.practice.algorithims.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class BiasedChandan{

    public static void main(String[] args) throws Exception {
    BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
    Integer number_Of_TestCases = Integer.parseInt(br.readLine());
        int final_Array  []=  new int[number_Of_TestCases];
        for(int i=0;i<number_Of_TestCases;i++){
            final_Array[i]= Integer.parseInt(br.readLine());
        }
        int count =0;
       Stack<Integer> myStack=new Stack<>();
        for(int k=0;k<final_Array.length;k++){
           if(final_Array[k]!=0){
               myStack.push(final_Array[k]);
           }
           if(final_Array[k]==0 && k!=0){
            myStack.pop();
           }
           
        }
        System.out.println(myStack.size()+"!!");
        Iterator<Integer> platesIterator = myStack.iterator();
        while (platesIterator.hasNext()) {
            Integer plate = platesIterator.next();
            count=count+plate;
        }
        System.out.println(count);

}
}