package com.ctci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharactersString {

    public static void main(String[] args) {
        String str = "aabbccddefghi";
        System.out.println(countCharacters(str));
        System.out.println(countCharactersHashMap(str));
        System.out.println(getOriginalString(countCharacters(str)) + " " + str.equals(getOriginalString(countCharacters(str))));

    }

    /**
     * @param str
     * @return
     */
    public static String countCharacters(String str) {

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
        return sb.toString();
    }

    /**
     * @param str
     * @return
     */
    public static String countCharactersHashMap(String str) {

        Map<Character, Integer> char_map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer value = char_map.get(str.charAt(i));
            if (value != null) {
                char_map.put(str.charAt(i), value + 1);
            } else {
                char_map.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> map : char_map.entrySet()) {
            sb.append(map.getKey() + "" + map.getValue());
        }
        return sb.toString();
    }

    public static String getOriginalString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    int val = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
                    System.out.println("--" + val + "  " + i);
                    for (int j = 0; j < val; j++) {
                        sb.append(str.charAt(i) + "");

                    }
                }
            }
        }

        return sb.toString();
    }
}
