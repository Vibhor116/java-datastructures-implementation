package com.equals3.classicinterviewquestions;

import com.equals3.classicinterviewquestions.solvemefirst.arrays.FindFirstAndSecondMaximumInArray;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.junit.Assert.*;

public class FindFirstAndSecondMaximumInArrayTest {

    private static final Random RANDOM = new Random();
    private static final int SIZE = 10000;

    private static Integer[] unsorted = null;


    @BeforeClass
    public static void setUp() throws Exception {
        unsorted = new Integer[SIZE];
        int count=0;
        for(int i=0;i<unsorted.length;i++){
            int randomValue= RANDOM.nextInt(unsorted.length*10);
            unsorted[count++]= randomValue;
        }
    }


    @Test
    public void testFirstAndSecondMaximumInArrayTest(){
        int result []=FindFirstAndSecondMaximumInArray.findFirstAndSecondMaximum(unsorted);
        Arrays.sort(unsorted,Collections.reverseOrder());
        assertArrayEquals(result,new int[]{unsorted[0],unsorted[1]});
    }
}