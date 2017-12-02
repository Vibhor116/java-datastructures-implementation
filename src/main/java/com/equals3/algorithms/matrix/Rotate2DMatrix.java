package com.equals3.algorithms.matrix;

public class Rotate2DMatrix {
	public static void main(String[] args) {
		// works for any N*N matrix
		int _2DMatrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrix(_2DMatrix);
		rotateMatrix(_2DMatrix);
	}

	private static void rotateMatrix(int[][] _2dMatrix) {

		for(int i = _2dMatrix.length-1;i>=0;i--){
			for(int j=0;j<_2dMatrix.length;j++){
				System.out.print(_2dMatrix[j][i]+" ");
			}
			System.out.println();
		}
	}

	private static void printMatrix(int[][] _2dMatrix) {
		for(int i=0;i<_2dMatrix.length;i++){
			for(int j =0 ;j<_2dMatrix.length;j++){
				System.out.print(_2dMatrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
