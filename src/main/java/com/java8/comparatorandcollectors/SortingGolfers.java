package com.java8.comparatorandcollectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.model.*;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


public class SortingGolfers{


    private List<Golfer> golfers = Arrays.asList(
        new Golfer("Jack", "Nicklaus", 68),
        new Golfer("Tiger", "Woods", 70),
        new Golfer("Tom", "Watson", 70),
        new Golfer("Ty", "Webb", 68),
        new Golfer("Bubba", "Watson", 70)
);

public static void main(String[] args) {
    
    SortingGolfers sg = new SortingGolfers();
    //        sg.defaultSort();
    //        sg.sortByScoreThenLast();
        //    sg.sortByScoreThenLastThenFirst();
            // sg.partitionByScore();
}

public List<Golfer> sortByScoreThenLastThenFirst() {
    return golfers.stream()
    .sorted(comparingInt(Golfer::getScore)
    .thenComparing(Golfer::getLast)
    .thenComparing(Golfer::getFirst))
    .collect(toList());
   }

   // default sort is by score
   public void defaultSort() {
    golfers.stream()
            .sorted()
            .forEach(System.out::println);
}

// sort by score, then equal scores by last name
public void sortByScoreThenLast() {
    golfers.stream()
            .sorted(Comparator.comparingInt(Golfer::getScore)
                    .thenComparing(Golfer::getLast))
            .forEach(System.out::println);
}

public void partitionByScore() {
    Map<Boolean, List<Golfer>> map = golfers.stream()
            .collect(Collectors.partitioningBy(
                    golfer -> golfer.getScore() < 70));

    map.forEach((k,v) -> {
        System.out.println(k);
        v.forEach(System.out::println);
    });
}
}