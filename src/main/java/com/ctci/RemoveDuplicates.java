package com.ctci;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcabcabcddeeffgbrgbnrobnr";
        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String str){

        StringBuilder sb =  new StringBuilder();
        boolean[] bool_arr =  new boolean[256];
        for(int  i =0 ;i<str.length();i++){

            int ascii_val = str.charAt(i);
            if(bool_arr[ascii_val] == false){
                sb.append(str.charAt(i));
                bool_arr[ascii_val]=true;
            }
        }
        return sb.toString();

    }
}
