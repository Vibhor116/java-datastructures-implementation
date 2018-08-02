package com.ctci;

import java.math.BigInteger;
import java.util.Stack;

public class A {

    public static void main(String[] args) {

        String binaryNumber = "10000001000000";

        long decimalNumber = convertBinaryToDecimal(binaryNumber);
        System.out.println(decimalNumber);
        BigInteger b = convertDecimalToBinary("1223");
        System.out.println(b);


    }

    static long flippingBits(long N) {
        String number = Long.toBinaryString(N);

        String ans = "";
        for (int i = 0; i < 32 - Long.toBinaryString(N).length(); i++)
            number = "0".concat(number);
        for (int i = 0; i < 32; i++)
            ans = ans.concat(String.valueOf(Long.parseLong(number.substring(i, i + 1)) ^ 1));
        return Long.parseLong(ans, 2);

    }

    private static BigInteger convertDecimalToBinary(String decimalNumber) {

        Stack<Integer> stack = new Stack<>();

        for (int i = decimalNumber.length() - 1; i >= 0; i--) {
            int d = Character.digit(decimalNumber.charAt(i), 10) % 2;
            stack.push(d);
            d = d / 2;
        }


        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {

            Integer pop = stack.pop();
            sb.append(pop);
        }
        return new BigInteger(sb.toString(), 10);
    }

    private static long convertBinaryToDecimal(String binaryNumber) {
        long reminder = 0;
        int i = 0;
        long result = 0;
        for (int k = binaryNumber.length() - 1; k >= 0; k--) {

            reminder = Character.digit(binaryNumber.charAt(k), 10);

            result += reminder * Math.pow(2, i);
            i++;
        }

        return result;
    }

}
