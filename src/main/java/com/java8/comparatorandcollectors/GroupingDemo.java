package com.java8.comparatorandcollectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class GroupingDemo{

    private static <K,V> void printMap(Map<K,V> map) {
        map.forEach((k,v) -> System.out.println(k + ": " + v));
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of",
                "strings", "to", "use", "as", "a", "demo");

        Map<Integer, List<String>> lengthMap = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        printMap(lengthMap);

        Map<Integer, Long> counting = strings.stream()
                .collect(groupingBy(String::length,
                        counting()));
        printMap(counting);

        Map<Integer, Optional<String>> minBy = strings.stream()
                .collect(groupingBy(String::length,
                        Collectors.minBy(comparingInt(String::length))));
        printMap(minBy);

        Map<Integer, Optional<String>> maxBy = strings.stream()
                .collect(groupingBy(String::length,
                        Collectors.maxBy(comparingInt(String::length))));
        printMap(maxBy);
    }
}