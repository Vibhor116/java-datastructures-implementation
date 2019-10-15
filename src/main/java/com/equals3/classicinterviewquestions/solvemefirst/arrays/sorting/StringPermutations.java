package com.equals3.classicinterviewquestions.solvemefirst.arrays.sorting;

public class StringPermutations{

    public static void main(String[] args) {
        
        String str="abc";
//        stringPermutations_1("",str);

            int arr[] = {1,2,5,3,4};
            //find max and min

            int max = arr[0];
            int min =arr[0];
            for(int i=0;i<arr.length;i++){
                    if(arr[i]>max){
                        max=arr[i];
                    }
                    else if(arr[i]<min){
                        min=arr[i];
                    }

            }
            System.out.println(max+" "+min);
    }

    private static void stringPermutations_1(String prefix, String str) {

        int len=str.length();
        if(len==0){
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<str.length();i++){
                stringPermutations_1(prefix+str.charAt(i),str.substring(0, i)+str.substring(i+1, len));
            }
        }
   
    }
}