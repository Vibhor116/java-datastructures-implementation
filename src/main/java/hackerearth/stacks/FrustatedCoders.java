//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/sniper-shooting/
package hackerearth.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class FrustatedCoders{

    public static void main(String[] args) throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Integer arr_size =Integer.parseInt(br.readLine());
        String [] my_arr = br.readLine().split("\\s+");
        int final_arr []= new int[arr_size];
        for(int i=0;i<arr_size;i++){
            final_arr[i]=  Integer.parseInt(my_arr[i]);
        }
        Arrays.sort(final_arr);
        Stack<Integer> myStack =  new Stack<>();
        for(int i=0;i<final_arr.length;i++){
            myStack.push(final_arr[i]);
        }
        for(int count=final_arr.length-1;count>=0;count--){
           if(myStack.peek()>final_arr[count]){
               myStack.pop();
               final_arr[count]=0; // frnd is dead
           }
        }
        // stream , slower then tradianal for loop ~ 1sec
        System.out.println(Arrays.stream(final_arr).sum());
        
    }
}