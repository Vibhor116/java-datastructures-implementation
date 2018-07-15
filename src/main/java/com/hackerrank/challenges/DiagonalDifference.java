package com.hackerrank.challenges;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        int [][] matrix ={{1,2,3},{4,5,6},{9,8,9}};
        diagonalDifference(matrix);
    }

    private static int  diagonalDifference(int[][] matrix) {

        int leftSum  =0;
        int rightSum=0;
        int l=0;
        int r =0;
        int len =matrix.length-1;
        while(l<matrix.length){

            leftSum=leftSum+matrix[l][r];
            rightSum=rightSum+matrix[l][len];
            l++;r++;len--;
        }
        return Math.abs(leftSum-rightSum);
    }

}
