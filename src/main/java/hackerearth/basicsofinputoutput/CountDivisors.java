//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDivisors{

    public static void main(String[] args) throws Exception {
        
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr[] =  br.readLine().split("\\s+");
    int l= Integer.parseInt(arr[0]);
    int r= Integer.parseInt(arr[1]);
    int k= Integer.parseInt(arr[2]);

    int count=0;
    while(l<=r){
        if(l%k==0){
            count++;
        }

        l++;
       
    }
    System.out.println(count);
    }
}