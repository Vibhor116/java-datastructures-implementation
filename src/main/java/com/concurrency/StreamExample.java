package com.concurrency;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample{

    public static void main(String[] args) {
        
      // init array
        int arr[] = {3,6,7,1,3,4,9};

      // find min of array
       int minimum= IntStream.of(arr).min().getAsInt();
       System.out.println(minimum);

       // anathor way
       IntStream.of(arr).min().ifPresent(min->System.out.println(min));



    // anathor way
    IntStream.of(arr).min().ifPresent(System.out::println);

    // summary Statitics

     IntSummaryStatistics statistics=   IntStream.of(arr).summaryStatistics();

     statistics.getMax();
     statistics.getMax();

     // three distinict smallest no

     IntStream.of(arr).distinct().sorted().limit(3).forEach(System.out::println);

     // util method
     IntStream.of(arr);
     IntStream.range(1, 100);
     IntStream.rangeClosed(1, 100);

     //  Sort Objects
     List<Employee> listEmployee = Employee.getAllEmployee();
     listEmployee.stream().
     sorted(Comparator.comparingInt(Employee::getSalary).reversed()).
     limit(3).map(Employee::getName)
     .forEach(emp->System.out.print(emp));
     
     //collectors
     
    }
}