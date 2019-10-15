package org.g4g.problems.warmups.anagrams;

//https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
public class CheckAnagram {

    public static void main(String[] args) {

        int x = 30;
        int y = 50;

        System.out.println(x + "  " + y);
        
        x=x+y;
        
        y= x-y;
        x= x-y;

        System.out.println(x + "  " + y);

    }
}
