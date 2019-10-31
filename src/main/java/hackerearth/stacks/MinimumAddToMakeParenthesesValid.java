//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/minimum-add-to-make-parentheses-valid-9cba6259/

package hackerearth.stacks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class  MinimumAddToMakeParenthesesValid
{

    public static void main(String[] args) throws Exception {
        
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String input = br.readLine();

     Stack<Character> myStack  =  new Stack<>();
     char [] input_arr =  input.toCharArray();

     for(int i=0;i<input_arr.length;i++){
         if(input_arr[i]=='('){
             myStack.push(input_arr[i]);
         }
          if (input_arr[i]==')'){
            if(myStack.isEmpty()){
                myStack.push(input_arr[i]);
            }
            else{
                if(myStack.peek()=='('){
                    myStack.pop();
                }
                else{
                    myStack.push(input_arr[i]);
                }
            } 
         }
        
        
        
     }
     System.out.println(myStack.size());
    }
}
