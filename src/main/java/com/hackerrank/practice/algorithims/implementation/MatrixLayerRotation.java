package com.hackerrank.practice.algorithims.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/matrix-rotation-algo/problem
public class MatrixLayerRotation {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
        List<Integer> list3 = Arrays.asList(9, 10, 11, 12);
        List<Integer> list4 = Arrays.asList(13, 14, 15, 16);
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        matrix.add(list4);
        matrixRotation(matrix, 2);
    }

    // Complete the matrixRotation function below.
    static void matrixRotation(List<List<Integer>> matrix, int r) {

        Integer[][] array = new Integer[matrix.size()][];
        Integer[] blankArray = new Integer[0];
        for (int i = 0; i < matrix.size(); i++) {
            array[i] = matrix.get(i).toArray(blankArray);
        }
        int  rows = array.length;
        int  cols = array[0].length;
        




    }

}