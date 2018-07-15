package com.hackerrank.challenges;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class StairCase {

    public static void main(String[] args) {

        int n = 6;
        drawStairCase(n);
    }

    private static void drawStairCase(int n) {
        String str="#";
        for (int i=0;i<n;i++)
        {
            System.out.printf("%"+(n+1)+"s",str+"\n");
            str=str+"#";
        }
    }
}
