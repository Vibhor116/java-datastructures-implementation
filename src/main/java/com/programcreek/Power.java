package com.programcreek;

/**
 * Custom Implement Math.pow() method
 */
public class Power {

    public static void main(String[] args) {
        System.out.println(pow(5, 5));
        System.out.println(Math.pow(20, 500));
    }

    public static double pow(double a, double b) {

        if (b == 1) {
            return a;
        }

        return  a * pow(a,b-1);

    }

}
