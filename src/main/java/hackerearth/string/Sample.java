package hackerearth.string;

import java.util.Arrays;
import java.util.Stack;

public class Sample {

    public static void main(String[] args) throws Exception {

        String str = "(){{}}()[]";

        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

          if(str.charAt(i)=='(' ||str.charAt(i)=='{'||str.charAt(i)=='['){
              myStack.push(str.charAt(i));
          }
          else{
              if(str.charAt(i)==')' && myStack.peek()=='('){
                myStack.pop();
              }
              if(str.charAt(i)=='}' && myStack.peek()=='('){
                myStack.pop();
              }
              if(str.charAt(i)==')' && myStack.peek()=='('){
                myStack.pop();
              }
          }

        }

    }
}