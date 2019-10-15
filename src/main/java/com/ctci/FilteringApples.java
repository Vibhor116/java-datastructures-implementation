package com.ctci;

import static java.util.Comparator.comparing;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {
  public static void main(String[] args) throws IOException {

    java.util.List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"),
        new Apple(120, "red"));
    inventory.sort(new AppleComparator()); 
    inventory.sort(comparing(Apple::getWeight));
    inventory.sort((Apple a1, Apple a2)-> a1.getWeight()-(a2.getWeight()));
    Predicate<String> nonEmptyStringPredicate = (String s) -> s.isEmpty();
    System.out.println(nonEmptyStringPredicate.test(""));

    // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
    List<Apple> greenApples = FilteringApples.filterApples(inventory, FilteringApples::isGreenApple);
    System.out.println(greenApples);

    // [Apple{color='green', weight=155}]
    List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
    System.out.println(heavyApples);

    // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
    List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
    System.out.println(greenApples2);

    // [Apple{color='green', weight=155}]
    List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
    System.out.println(heavyApples2);
    // []
    List<Apple> weirdApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
    System.out.println(weirdApples);

    //
  
    //
  }

  public static boolean isHeavyApple(Apple apple) {
    return apple.getWeight() > 150;
  }

  public static boolean isGreenApple(Apple apple) {
    return "green".equals(apple.getColor());
  }

  public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple : inventory) {
      if (p.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }

  static class AppleComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple a1, Apple a2) {
      return a1.getWeight() - a2.getWeight();
    }

	public static void main(String[] args)  {
	
	    int maximum =-1;
	    int[] prices ={2, 3, 10, 6, 4, 8, 1};
	
	    for(int i =0;i<prices.length;i++){
	        for(int j=i+1;j<prices.length;j++){
	            
	        }
	    }
	
	}

  }

}