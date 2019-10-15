package com.equals3.algorithms.stacks;

import java.util.Stack;

import com.equals3.algorithms.linkedlists.ListIterator;

public class SortStackUsingTempStack{

public static void main(String[] args) {

    Stack<Integer> myStack =  new Stack<>();
    for(int i =0;i<10;i=i+2)
    myStack.push(i);
    
    java.util.ListIterator<Integer> itr = myStack.listIterator();
      while(itr.hasNext()){
          System.out.print(itr.next()+" ");
      }
      
   Stack<Integer> sortedStack= SortStackUsingTempStack(myStack);
    
      java.util.ListIterator<Integer> sortedS = sortedStack.listIterator();
      while(sortedS.hasNext()){
          System.out.print(sortedS.next()+" ");
      }

}

    private static Stack<Integer> SortStackUsingTempStack(Stack<Integer> myStack) {


        Stack<Integer> tempStack = new Stack<>();
        while(!myStack.isEmpty()){
          tempStack.push(myStack.pop());
        }
        return tempStack;
        
    }

}