package com.warmup.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RunLengthEncoding {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_String = br.readLine();
        char[] input_char = input_String.toCharArray();
        Arrays.sort(input_char);
        // aabbccdefghiiijk
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input_char.length; i++) {

            if (i < input_char.length - 1 && input_char[i] == input_char[i + 1]) {
                count++;
            } else {
                sb.append(input_char[i]+""+count);
                count=1;
            }
        }
        System.out.println(sb.toString());

    }
}