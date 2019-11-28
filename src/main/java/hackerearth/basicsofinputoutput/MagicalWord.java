//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/magical-word/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class MagicalWord{

    public static void main(String[] args) throws Exception {

        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        Integer totalTestCases  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<totalTestCases;i++){
            Integer strLen = Integer.parseInt(br.readLine());
             String input = br.readLine();
            char charArr[] = input.toCharArray();
            for(int inner=0;inner<charArr.length;inner++){
                int ascii =  charArr[inner];
                System.out.println(ascii);
                if(isPrime(ascii)){
                    sb.append(charArr[inner]+"");
                }
                else{
                    nextPrime(ascii);
                }
            }
        }
        }

        private static int nextPrime(int ascii) {

            return 1;
            
    }

    static boolean isPrime(int n) 
        { 
            // Corner case 
            if (n <= 1) 
                return false; 
           
            // Check from 2 to n-1 
            for (int i = 2; i < n; i++) 
                if (n % i == 0) 
                    return false; 
           
            return true; 
        } 
    }
