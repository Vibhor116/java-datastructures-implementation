package com.java8.comparatorandcollectors;

public class TimeIt {

    public static void code(Runnable block) {
        long start = System.nanoTime();
        try {
            block.run();
        } 
        finally{
            long end = System.nanoTime();
            System.out.println("time taken ="+(end-start)/1.0e9);
        }
    }
}