package com.equals3.classicinterviewquestions.solvemefirst.arrays.searching;

import static org.junit.Assume.assumeNoException;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

import com.equals3.algorithms.queues.PriorityQueue;

/**
 * 
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms
 * required.
 */
public class MinimumMeetingRoomRequired {

    private static class Difference {
        public int startTime;
        public int endTime;

        public Difference(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public Difference() {
            this.startTime = 0;
            this.endTime = 0;

        }

        @Override
        public String toString() {
            return "Difference [endTime=" + endTime + ", startTime=" + startTime + "]";
        }

    }

    public static void main(String[] args) {
        Difference[] diff = new Difference[3];
        diff[0] = new Difference(0, 30);
        diff[1] = new Difference(5, 10);
        diff[2] = new Difference(15, 20);

      int rooms=  minimumMeetingRoomsRequiredArrays(diff);
        System.out.println(rooms);
    }

    // PQ impl
    private static int minimumMeetingRoomsRequired(Difference[] diff) {

        if (diff.length == 0) {
            return 0;
        }
        // sort diff array
        Arrays.sort(diff, new Comparator<Difference>() {

            @Override
            public int compare(Difference d1, Difference d2) {
                return d1.endTime - d2.endTime;
            }

        });
        // or use lambda to sort
        // Arrays.sort(diff,(end1,end2)->end1.endTime-end2.endTime);
        java.util.PriorityQueue<Difference> priorityQueue = new java.util.PriorityQueue<>((a,b)->a.endTime-b.endTime); // pass comparator
        priorityQueue.offer(diff[0]);
      

        // minimum 1 room is required
        int requiredRooms=1;
        for(int i=1;i<diff.length;i++){
            Difference difference =priorityQueue.poll();
            if(diff[i].startTime>=difference.endTime){
                difference = new Difference(difference.startTime,diff[i].endTime);
            }
            else{
                // more rooms reuired
                requiredRooms=requiredRooms+1;
                priorityQueue.offer(diff[i]);
            }
            priorityQueue.offer(difference);
        }
        return requiredRooms;
    }

    
    private static int minimumMeetingRoomsRequiredArrays(Difference[] diff) {

        int startArr[]= new int[diff.length];
        int endArr[]= new int[diff.length];  
        
        for(int i=0;i<diff.length;i++){
            startArr[i]=diff[i].startTime;
            endArr[i]=diff[i].endTime;
        }
        Arrays.sort(startArr);
        Arrays.sort(endArr);
        System.out.println(Arrays.toString(startArr));
        System.out.println(Arrays.toString(endArr));

        int flag=0;
        int numberofRooms =0;
        for(int i=0;i<startArr.length;i++){

            if(startArr[i]<endArr[flag]){
                numberofRooms++;
            }
            else{
                flag++;
               
            }
        }

        return numberofRooms;

    
    }
}