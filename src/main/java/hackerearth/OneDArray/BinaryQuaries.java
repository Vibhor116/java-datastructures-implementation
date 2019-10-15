package hackerearth.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/range-query-2/description/
public class BinaryQuaries {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader  =  new BufferedReader( new InputStreamReader(System.in));
     String N_Q []=   bufferedReader.readLine().split("\\s+");
     int N_Array[] = new int[Integer.parseInt(N_Q[0])];
     for(int i=0;i<Integer.parseInt(N_Q[0]);i++){
        N_Array[i]=Integer.parseInt(bufferedReader.readLine().split("\\s+")[i]);

     }
    String arr1[]= bufferedReader.readLine().split("\\s+");
    for(int a=0;a<arr1.length;a++){
        N_Array[a]=Integer.parseInt(arr1[a]);
    }
   
     for(int j=0;j<Integer.parseInt(N_Q[1]);j++){
       String arr[]= bufferedReader.readLine().split("\\s+");
       String op="";
       for(int i=0;i<arr.length;i++){
           if(Integer.parseInt(arr[0])==1){
               int index =Integer.parseInt(arr[0]);
               int pos=--index;
               if(N_Array[pos]==1){
                N_Array[pos]=0;
               }
               else{
                N_Array[pos]=1;
               }
           

           }
           if(Integer.parseInt(arr[0])==0){
            
            int range1= Integer.parseInt(arr[1]);
            int range2= Integer.parseInt(arr[2]);
            int finalrange=range1-1;
            StringBuilder sb =new StringBuilder();
            for(int k=finalrange;k<range2-1;k++){
               sb.append(N_Array[k]);
            }
          int  decimal= binaryToDecimal(Integer.parseInt(sb.toString()));
           if(decimal%2==0){
               op="EVEN";
           }
           else{
              op="ODD";
           }

        

        }
       }
      System.out.println(op);
     }
    }
    static int binaryToDecimal(int n) 
    { 
        int num = n; 
        int dec_value = 0; 
  
        // Initializing base 
        // value to 1, i.e 2^0 
        int base = 1; 
  
        int temp = num; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
  
        return dec_value; 
    } 

}