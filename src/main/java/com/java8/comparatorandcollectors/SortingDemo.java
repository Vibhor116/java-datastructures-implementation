package com.java8.comparatorandcollectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortingDemo{

    public static void main(String[] args) {
        
         List<String> sampleStrings =Arrays.asList("this", "is", "a", "list", "of", "strings");

            // sorting list lexicographically
            
          //  System.out.println("java 7 way "+defaultSortJava7(sampleStrings));
            
           // System.out.println("java 8 way "+sortingWithjava8(sampleStrings));

        //   System.out.println("String sort by length java 7 way "+lengthReverseSortWithComparator(sampleStrings));
           System.out.println("String sort by length java 8 way "+lengthSortWithLambda(sampleStrings));



            
    }

    public static List<String> defaultSortJava7(List<String> sampleStrings){
         Collections.sort(sampleStrings);
         return sampleStrings;
    }
    public static List<String> sortingWithjava8(List<String> sampleStrings){
        // sampleStrigs is immutable , following method retun a new list
      return sampleStrings.stream().sorted().collect(Collectors.toList());
        //return sampleStrings;
   }

   // Java 7- using Comparator with anonymous inner class
    public static List<String> lengthReverseSortWithComparator(List<String> sampleStrings) {
        Collections.sort(sampleStrings,new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.length()-o1.length();
        }
        });
        return sampleStrings;
    }

    // Using a lambda as a Comparator with a lambda
    public static List<String> lengthSortWithLambda(List<String> sampleStrings) {
        Collections.sort(sampleStrings,
                (s1, s2) -> s1.length() - s2.length());
        return sampleStrings;
    }

    //Using a Comparator using the comparingInt method

    public static List<String> lengthSortUsingComparator(List<String> sampleStrings){
        return sampleStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
    }

 // Length sort, then alphabetical
public static List<String> lengthSortThenAlphaSort(List<String> sampleStrings) {
    Collections.sort(sampleStrings,
            Comparator.comparingInt(String::length)
                    .thenComparing(Comparator.naturalOrder()));
    return sampleStrings;
}    


    // Sort by length then alpha using sorted
    public List<String> lengthSortThenAlphaSortUsingSorted(List<String> sampleStrings) {
        return sampleStrings.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }

    // Sort by length then reverse alpha using sorted
    public List<String> lengthSortThenReverseAlphaUsingSorted(List<String> sampleStrings) {
        return sampleStrings.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }
}