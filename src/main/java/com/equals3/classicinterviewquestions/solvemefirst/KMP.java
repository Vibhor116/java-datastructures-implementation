package com.equals3.classicinterviewquestions.solvemefirst;

public class KMP{
    private final int R;       // the radix
    private int[][] dfa;       // the KMP automoton

    private char[] pattern;    // either the character array for the pattern
    private String pat;        // or the pattern string

    public KMP(String pattern) {
        this.R=256;
        this.pat=pattern;
        // build DFA from pattern
        int m = pat.length();
        dfa = new int[R][m]; 
        dfa[pat.charAt(0)][0] = 1; 
        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < R; c++) 
                dfa[c][j] = dfa[c][x];     // Copy mismatch cases. 
            dfa[pat.charAt(j)][j] = j+1;   // Set match case. 
            x = dfa[pat.charAt(j)][x];     // Update restart state. 
        } 
    }

    public static void main(String[] args) {
        String text="abacadabrabracabracadabrabrabracad";

        String pattern  ="rab";
        char []  textArray= text.toCharArray();
        char[] patternArray= pattern.toCharArray();
        KMP kmp1= new KMP(pattern);
        String s="01";
        System.out.println(s.charAt(0));
        if(s.charAt(0)=='0'){
            System.out.println("print");
        }
    }
}