//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class AliAndHelpingInnocentPeople{

    public static void main(String[] args) throws Exception{
      
      String s="baceb";
      int count=0;
      for(int i=0;i<s.length()-1;i++){
          for(int j=i;j<s.length();j++){

            for(int k=i;k<=j;k++){
            if(s.charAt(k)=='a'||s.charAt(k)=='e'||s.charAt(k)=='i'||s.charAt(k)=='o'
            ||s.charAt(k)=='u'){
                count++;
            }              
            }
            System.out.println();
          }
          System.out.println();
      }
      System.out.println(count);

    }
}