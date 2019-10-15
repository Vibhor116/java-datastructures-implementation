package com.equals3.algorithms.stacks;

import java.util.ListIterator;
import java.util.Stack;

public class ReverseNumberUsingStack {
    public static void main(String[] args) {

        int number = 14532;
        Stack<Integer> reverseNumber = reverseNumberUsingStack(number);
        // now sort this step
        Stack<Integer> reverseNumber1=  sortNumberUsingStack(reverseNumber);
        ListIterator<Integer> itr = reverseNumber1.listIterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }

    private static Stack<Integer> sortNumberUsingStack(Stack<Integer> myStack) {
       
        while(!myStack.isEmpty()){

            int topItem=myStack.pop();
           sortNumberUsingStack(myStack);
           sortStackUsingRecursion(myStack,topItem);

        }
        return myStack;
    }

    private static void sortStackUsingRecursion(Stack<Integer> myStack, int topItem) {

        if(myStack.size()==0 ||topItem>myStack.peek()){
            myStack.push(topItem);
            return;
        }
        int  temp =myStack.pop();
        sortStackUsingRecursion(myStack,topItem);
        myStack.push(temp);
    }

    private static Stack<Integer> reverseNumberUsingStack(int number) {

        Stack<Integer> myStack = new Stack<>();

        while (number != 0) {
            int num = number % 10;
            myStack.push(num);
            number = number / 10;
        }

        return myStack;
    }

}