package com.equals3.classicinterviewquestions.solvemefirst.arrays;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aabbbbcccddddeefffa";
        runLengthEncoding(str);
    }

    private static void runLengthEncoding(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if ((i + 1) < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count = count + 1;
            } else {
                sb.append(str.charAt(i));
                sb.append(count + 1);
                count = 0;
            }
        }
        System.out.println(sb.toString());
    }

}
