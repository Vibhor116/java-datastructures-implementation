package org.g4g.problems.matrix;

//https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

public class SpiralPrinting {

    public static void main(String[] args) {
       int arr [][]= {{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16},{17,18 ,19,20}};
       int rows  = arr.length;
       int cols = arr[0].length;
       SpiralPrinting.printMatrixSpirally(arr, rows, cols);         
    }

    private static void printMatrixSpirally(int[][] arr, int rows, int cols) {
        
        int iterator =0;
        int i=0;//rows
        int j=0; //cols

        while (i<rows && j<cols) {
            for(iterator=j;iterator<cols;iterator++){
                System.out.print(arr[j][iterator]+" ");
            }
            i++;  // 1,3, 23,33
            for(iterator=i;iterator<rows;iterator++){
                System.out.println(arr[iterator][cols-1]);
            }
            cols--;
            if(i<rows){
                for(iterator=cols-1;iterator>=j;iterator--){
                    System.out.println(arr[rows-1][iterator]);
                }
                rows--;
            }
            if(j<cols){
                for(iterator=rows-1;iterator>=i;iterator--){
                    System.out.println(arr[iterator][j]);
                }
                j++;
            }
            
        }
    }
}