//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/signal-range/

package hackerearth.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SignalRange{

    public static void main(String[] args) throws Exception{
        
     BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
     Integer totalTestCases=   Integer.parseInt(br.readLine());
     for(int i=0;i<totalTestCases;i++){
     // total no of testCases
     Integer arr_length=   Integer.parseInt(br.readLine());
     int finalArr[] =  new int[arr_length];
     String char_Arr[]= br.readLine().split("\\s+");
     for(int j =0 ;j<finalArr.length;j++){
         finalArr[j]= Integer.parseInt(char_Arr[j]);
     }
     Stack<Integer> stack =  new Stack<>();
     StringBuilder sb = new StringBuilder();
     stack.push(0);
    sb.append("1 ");
     for(int fin=1;fin<finalArr.length;fin++){
        
        while(!stack.isEmpty() && finalArr[stack.peek()]<=finalArr[fin] ){
            stack.pop();
        }
        if(stack.isEmpty()){
            sb.append(finalArr[fin+1]+" ");
        }
        else{
              sb.append(fin-stack.peek()+" ");
        }
        stack.push(fin);
         
     }
 System.out.println(sb.toString());
    }
   
}
}