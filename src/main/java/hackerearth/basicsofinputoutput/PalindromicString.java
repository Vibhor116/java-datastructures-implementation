//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/


package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromicString{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        
        int left =0;
        int right=input.length()-1;
        while(left<=right){
            if(input.charAt(left)==input.charAt(right)){

                left++;
                right--;
            }
            else{
                System.out.println("NO");
                return;
            }
           
        }
        System.out.println(right+"  "+left);
    //vibhor@besttempmail.com
    }
}