package com.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String Name;
    private int salary;

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    Employee(String name,Integer salary){
        this.Name=name;
        this.salary=salary;
    }

    public static List<Employee> getAllEmployee(){

        List<Employee> myList = new ArrayList<>();

        myList.add(new Employee("a", 1));
        myList.add(new Employee("z",333));
        myList.add(new Employee("f",111));
        return myList;
        
    }
}