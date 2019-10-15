package org.g4g.problems.matrix;

public class Spiral {


	
	public static void main(String[] args) {


		int arr[][] = {{1,2,3,4},
				        {5,6,7,8},
		                 {9,10,11,12},
		                  {13,14,15,16},
		                  {17,18,19,20}};

		int rows  = arr.length;
		int cols = arr[0].length;
		recursiveSpirally(arr,rows,cols,0);
	}

	private static void recursiveSpirally(int[][] arr, int rows, int cols,int s) {

		int iterator =0;
		int row_index=0;
		int col_index=0;

		while(row_index<rows && col_index<cols){

			for(iterator=col_index;iterator<cols;iterator++){
				System.out.print(arr[row_index][iterator]+" ");
			}
			row_index++;
			for(iterator=row_index;iterator<rows;iterator++){
				System.out.print(arr[iterator][cols-1]+" ");
			}
			cols--;
			if(row_index<rows){
				for(iterator=cols-1;iterator>=col_index;iterator--){
					System.out.print(arr[rows-1][iterator]+" ");
				}
				rows--;
			}
			
			if(col_index<cols){
				for(iterator=rows-1;iterator>=row_index;iterator--){
					System.out.print(arr[iterator][col_index]+" ");
				}
				col_index++;

			}
		}
		
}
}
