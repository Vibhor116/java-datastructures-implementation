package com.java8.Java_Util_Function;

import java.beans.Expression;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public  class ForEachDemo{

    public static void main(String[] args) {
         List<String> strings = Arrays.asList("This", "is", "a", "list", "of", "strings");

         //Anonymous inner class implementation
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

       // Expression lambda
        strings.forEach(s -> System.out.println(s));

        //methor refernce
        strings.forEach(System.out::println);

        Consumer<String> printer = System.out::println;
        strings.forEach(printer);
    }
}