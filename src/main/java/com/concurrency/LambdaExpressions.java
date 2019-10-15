package com.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpressions{

    public static void main(String[] args) {
       
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);

        // iterate and print the values
        //ecxternal iteraotr
        for(int i=0;i<values.size();i++){
            System.out.print(values.get(i)+" ");
        }
        System.out.println();
        System.out.println("----");
      
        //(less moving parts)
        for(Integer val:values){
            System.out.print(val+" ");
        }
       
        System.out.println();
        System.out.println("----");
        // more ceremony
        values.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
               System.out.print(t+" ");

            }
        
        });

        System.out.println();
        System.out.println("----");
      
        //internal iterator , lambda
        values.forEach(val -> System.out.print(val+" "));  // lazy, seq, concurrent (polymorphism)

        
        System.out.println();
        System.out.println("----");
        // method refernce pass thorough
        values.forEach(System.out::print);

        // funtional interface single abastract method
        //@consumer,@Runnable

        // double each value abd total values  
        int total=0;
        for(Integer  i:values){
            total=total+i*2;
        }
        System.out.println();
        System.out.println(total+" total");
        
        // declerative ( stream fancy  iterator)
        // what to  do not how to  do // scatter gather
      int value=  values.stream().map(e->e*2).reduce(0,(c,e)->c+e); //two i/p one o/p
      System.out.println(value);

      // default method : body inside interface
      // def method interheted automatially like normal method
      // you can override default method
      //class herch rule
      

      // write a method to recive lambda expression
      List<Integer> numbers = Arrays.asList(1,2,3,4);
      System.out.println(totalValues(numbers));
      System.out.println(totalValuesPredicate(numbers, n -> n % 2 == 0)); // stretgy pattern
      System.out.println(totalValuesPredicate(numbers, n -> n % 2 != 0));
    }

    private static int totalValues(List<Integer> numbers) {
       
        // total values , even values and odd values
        int total =0;
        for(Integer num:numbers){
            total=total+num;
        }
        return total;
    }

    private static int totalValuesPredicate(List<Integer> numbers,Predicate<Integer> predicate) {
       
        // total values , even values and odd values
        int total =0;
        for(Integer num:numbers){
            if(predicate.test(num)){
                total=total+num;

            }
        }
        return total;
    }

    
}