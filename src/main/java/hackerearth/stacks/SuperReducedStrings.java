//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/super-reduced-strings-303701dd/

package hackerearth.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperReducedStrings {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        char[] char_arr = inputString.toCharArray();
        java.util.Stack<Character> myStack = new java.util.Stack<>();
        for (int i = 0; i < char_arr.length; i++) {

            if (!myStack.isEmpty()) {
                if (myStack.peek() == char_arr[i]) {
                    myStack.pop();
                }
                else{
                    myStack.push(char_arr[i]);
                }

            }
             else {
                myStack.push(char_arr[i]);
            }

        }
        StringBuilder  sb = new StringBuilder();
        while(!myStack.isEmpty()){
            sb.append(myStack.pop());
        }
        if(myStack.isEmpty())System.out.println("Empty String");
        else System.out.println(sb.reverse().toString());
    }
}