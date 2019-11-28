//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/a-movement-1/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AMovement{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer key = Integer.parseInt(br.readLine());

       if(key%5==0){
System.out.println(key/5);
       }
       else{
           System.out.println((key/5)+1);
       }
    }
}