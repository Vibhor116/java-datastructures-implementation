package com.equals3.algorithms.arrays.search;

import java.util.Arrays;

class GenericBinarySearch<T> {

    public static void main(String[] args) {
        // GenericBinarySearch<Integer> search = new GenericBinarySearch<>();
        // GenericBinarySearch.search(new Integer[] { 1, 2, 3, 4 ,5,6,7,8,9},
        // Integer.valueOf(223));
        // GenericBinarySearch.search(new String[] {"a","b","c","d","e","f"}, "hs");
     //   GenericBinarySearch.search(new Double[] { 1.0, 2.0, 3.0, 4.0 }, Double.valueOf(12.322));
        GenericBinarySearch.searchRec(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, Integer.valueOf(32343), 0, 10);

    }

    private static <T extends Comparable<T>> void search(T[] is, T searchTearm) {
        if (!(is instanceof Integer[]) || !(is instanceof String[])) {
            throw new ClassCastException("DEF");
        }
        // code
        int left = 0;
        int right = is.length - 1;
        int mid = 0;

        while (right >= left) {
            mid = (left + right) / 2;
            System.out.println(23 + "  " + is[mid]);

            if (is[mid].compareTo(searchTearm)==0) {
                System.out.println("found");
                break;
            }

            else if (searchTearm.compareTo(is[mid]) <= -1) {
                right = mid - 1;
            } else if (searchTearm.compareTo(is[mid]) >= 1) {
                left = mid + 1;
            }
        }

        if (left > right) {
            System.out.println(" nit gofjikfn");
        }

    }

    ///////////

    private static <T extends Comparable<T>> void searchRec(T[] is, T searchTearm, int left, int right) {

        // base condditon
        int mid = (left + right )/ 2;
        if(left>right || is.length<=left){
            System.out.println(" not found elem");
            return;
        }
        if (is[mid].compareTo(searchTearm)==0 ) {
            System.out.println("found recuresly");
            return;
        }
       
        else if(is[mid].compareTo(searchTearm)>=1){
            GenericBinarySearch.searchRec(is,searchTearm,left,mid-1);
        }
        
        else if(is[mid].compareTo(searchTearm)<=-1){
            GenericBinarySearch.searchRec(is,searchTearm,mid+1,right);
        }
    }
}