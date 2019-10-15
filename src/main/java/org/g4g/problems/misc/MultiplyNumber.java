package org.g4g.problems.misc;

// https://www.geeksforgeeks.org/multiply-two-numbers-without-using-multiply-division-bitwise-operators-and-no-loops/

public class MultiplyNumber {
    public static void main(String[] args) {

        int x= 33;
        int y =3;
      int finalVal=  multiplyNumbers(x,y);
      System.out.println(finalVal);
    }

    private static int multiplyNumbers(int x, int y) {

        if(y==0){
            return 0;
        }
        if(y>0){
            return  x+multiplyNumbers(x, y-1);
         }
        return -1;
       
    }

}