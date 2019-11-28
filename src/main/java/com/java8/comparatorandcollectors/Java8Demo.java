package com.java8.comparatorandcollectors;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import static java.util.stream.Collectors.*;

public class Java8Demo{

    public static void main(String[] args) {
        // name 
        //paramter list , imp
        // body  , imp
        //return type

        Thread t=  new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println("in anathor thred");
            }
        });
        t.start();

        Thread lembdThread= new Thread(()->System.out.println("lambda thread"));
        lembdThread.start();
        System.out.println("In Main");

        // static method
        //instanse methpd
        //route

        List<Integer> list =  Arrays.asList(1,2,3,4,5);

        // external itrer

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // 2nd ver

        for(int i:list){
            System.out.println(i);
        }
        //polimorphism, internal
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
               System.out.println(t+"-");
                
            }
        });
        // auto pilot iteration

        list.forEach((Integer i)->System.out.println(i));
        System.out.println("ver 2");
        list.forEach(( i)->System.out.println(i));  //ver 2  , obvoius
        list.forEach( i->System.out.println(i)); 
        list.forEach(System.out::println);// method refrence ,pass through 
        list.stream().
        //map(e->String.valueOf(e)).
        map(String::valueOf).
        forEach(System.out::println);

        list.stream().
   map(e->String.valueOf(e)).
        map(String::toString).
        forEach(System.out::println);

        // two parameers as args

        list.stream().reduce(0,(total,e)->Integer.sum(total, e));
        list.stream().reduce(0,Integer::sum);

        list.stream().map(String::valueOf).
        //reduce("",String::concat);
        reduce("",(carry,str)->carry.concat(str));

        // limitations
        // cant use if u r doing any manuplation with data
        // cant use if conflict with instanse and static method

        // new excice
        // double th even numbers  and total
        list.stream().
        filter(i->i%2==0).map(i->i*2).reduce(0,Integer::sum);
        list.stream().filter(i->i%2==0).mapToInt(i->i*2).sum();

        //
        TimeIt.code(()->System.out.println(list.parallelStream().filter(i->i%2==0).mapToInt(i->compute(i)).sum()));

        //  streams starts here, streams is not data
        // stream is bunch of functions 
        // collect

        List<Integer> newList = Arrays.asList(1,2,3,4,5,1,2,3,4,5);
        // double the even values and put into list
       // dont do this
        newList.stream().filter(i->i%2==0).map(i->i*2).forEach(i-> newList.add(i));
        System.out.println(newList); // dont do this
        // better way ,colletcors


        List<Integer> newList2 =  newList.stream().filter(i->i%2==0).map(i->i*2).collect(toList());
        System.out.println(newList2); //thread safe , avoid share mutability
    }

    private static int compute(Integer i) {
        // time intensive
        try{
        Thread.sleep(1000);
        }
        catch(Exception e){

        }
        return i*2;
    }
}