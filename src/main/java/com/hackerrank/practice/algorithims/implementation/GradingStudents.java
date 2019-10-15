package com.hackerrank.practice.algorithims.implementation;

//https://www.hackerrank.com/challenges/grading/problem
public class GradingStudents {

    public static void main(String[] args) {

    }

    static int[] gradingStudents(int[] grades) {

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] >= 38) {
               int multiplier= multiplier(grades[i]);
                if(multiplier-grades[i]<3){
                    grades[i]=multiplier;
                }
            }
        }
        return grades;

    }

    private static int multiplier(int grade){
       return (grade + 4) / 5 * 5;
    }
}