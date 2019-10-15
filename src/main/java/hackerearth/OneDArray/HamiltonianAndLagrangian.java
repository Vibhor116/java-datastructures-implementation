//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/hamiltonian-and-lagrangian/

package hackerearth.OneDArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class HamiltonianAndLagrangian{

    public static void main(String[] args) throws Exception {
        
    BufferedReader br   =  new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int final_Arr[] =new int[num];
    StringBuilder sb = new StringBuilder();
    String[] values = br.readLine().split("\\s+");
    for(int i=0;i<num;i++){
        final_Arr[i]= Integer.parseInt(values[i]);
    }
    Stack<Integer>myStack= new java.util.Stack<>();
    myStack.push(final_Arr[final_Arr.length-1]);
    for(int k =final_Arr.length-2 ;k>=0;k--){
        if(final_Arr[k]>=myStack.peek()){
            myStack.push(final_Arr[k]);
        }
    
    }
    while(myStack.size()!=0){
        sb.append(myStack.pop()+" ");
    }
    System.out.println(sb.toString());
}
}
