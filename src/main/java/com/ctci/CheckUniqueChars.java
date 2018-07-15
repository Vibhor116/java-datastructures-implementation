package com.ctci;


public class CheckUniqueChars {

    public static void main(String [] args){
        String  str  ="abcdefgh2131";
        System.out.println(isUniqueChars(str));
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
