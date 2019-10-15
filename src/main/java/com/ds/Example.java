package com.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Collection;
import java.util.Comparator;

public class Example {

    public static void sort(Comparable[] Comparable) {

    }

    private static boolean less(Comparable comp1, Comparable comp2) {

        return comp1.compareTo(comp2) < 0;
    }

    private static void exchange(Comparable comp[], int i, int j) {
        Comparable temp = comp[i];
        comp[i] = comp[j];
        comp[j] = temp;
    }

    private static void show(Comparable[] comp) {

        for (int i = 0; i < comp.length; i++) {
            System.out.print(comp[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1]))
                return false;
        return true;
    }

    public static void main(String[] args) throws Exception{ // Read strings from standard input, sort them, and print.
   BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("\\s+");
        sort(a);
        assert isSorted(a);
        show(a);
    }

}