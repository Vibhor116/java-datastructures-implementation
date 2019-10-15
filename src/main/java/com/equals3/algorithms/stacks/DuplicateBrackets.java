package com.equals3.algorithms.stacks;

import java.util.Stack;

//https://www.geeksforgeeks.org/find-expression-duplicate-parenthesis-not/
public class DuplicateBrackets {

    public static void main(String[] args) {

        String expression = "((((a+(b))+(c+d))))";
        boolean ans = findDuplicateBrackets(expression);
        System.out.println(ans);

    }

    private static boolean findDuplicateBrackets(String expression) {

        Stack<Character> myStack = new Stack<>();
        for(int i=0 ;i<expression.length();i++){
            if(expression.charAt(i) ==')'){

                char top = myStack.peek();
                int count=0;
                while(top!='('){
                    count++;
                    top = myStack.peek(); 
                    myStack.pop();

                }
                if(count<1){
                    return true;
                }
                
            }
            else{

                myStack.push(expression.charAt(i));
            }
            
        }
        return false;
    }

}