package org.g4g.problems.matrix;

public class SetRowsAndColumnsZero {

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3, 4}, {5, 2, 7, 8},
                {9, 10, 0, 12}, {13, 14, 15, 16}};

        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        boolean rowArr [] = new boolean[rows];
        boolean colsArr [] = new boolean[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==0){
                    rowArr[i] = true;
                    colsArr[j]=true;
                }
            }
        }

        for(int i =0;i<rowArr.length;i++){
            if(rowArr[i]==true){
                nullifyRows(arr,i);

            }
        }
        for(int j =0;j<colsArr.length;j++){
            if(colsArr[j]==true)
            nullifyCols(arr,j);
        }
        System.out.println("----------");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    private static void nullifyCols(int[][] arr, int j) {

        for(int i=0;i<arr[0].length;i++){
            arr[i][j]=0;
        }

    }

    private static void nullifyRows(int[][] arr, int i) {
        for(int j=0;j<arr[0].length;j++){
    arr[i][j]=0;
        }
    }
}
