//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber{

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer val = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<=val;i++){
            if(isPrime(i)){
                sb.append(i+" ");
            }
            
        }

        System.out.println(sb.toString());
    }
    static boolean isPrime(int n) 
    { 
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i < n; i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    } 
}