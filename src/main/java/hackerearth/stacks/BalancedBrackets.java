//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/balanced-brackets-3-4fc590c6/

package hackerearth.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedBrackets{


    public static void main(String[] args) throws Exception {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        Integer ip = Integer.parseInt(br.readLine());
        for(int i=0;i<ip;i++){

            String str  =  br.readLine();
            Stack<Character> myStack = new Stack<>();
            char char_Arr[]=  str.toCharArray();
            for(int inner=0;inner<char_Arr.length;inner++){

                if(char_Arr[inner]=='{' || char_Arr[inner]=='[' || char_Arr[inner]=='('){
                    myStack.add(char_Arr[inner]);
                }
                else{
                    
                    if(!myStack.isEmpty() && (char_Arr[inner] ==')' && myStack.peek()=='(')){
                        myStack.pop();
                    }
                      if(!myStack.isEmpty() && (char_Arr[inner] ==']' && myStack.peek()=='[')){
                        myStack.pop();
                    }
                      if(!myStack.isEmpty() && (char_Arr[inner] =='}' && myStack.peek()=='{')){
                        myStack.pop();
                    }
                }
            }
            if(myStack.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}