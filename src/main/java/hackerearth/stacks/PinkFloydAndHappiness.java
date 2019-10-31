//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/b-48/

package hackerearth.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PinkFloydAndHappiness {

    public static void main(String[] args) throws Exception {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        Integer ip = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("\\s+");
        int final_arr[] = new int[ip];
        for(int i=0;i<final_arr.length;i++){
            final_arr[i]=Integer.parseInt(arr[i]);
        }
        List<Integer> playList = new ArrayList<>();
        Stack<Integer> myStack =  new Stack<>();
        for(int i=0;i<final_arr.length-1;i++){
           if(final_arr[i]<final_arr[i+1]){
               playList.add(final_arr[i]);
           }
           else{
               if(!myStack.isEmpty() && myStack.peek()<final_arr[i]){
                playList.add(final_arr[i]);
                  myStack.pop();

               }
               else{
            myStack.push(final_arr[i]);

               }
           }
        }
        if(myStack.isEmpty()){
            System.out.println("Sad");
        }
        else{
    System.out.println("Happy");
        }
         
    }
}