//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/vowels/

package hackerearth.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelPhobia{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Integer number_Of_TestCases= Integer.parseInt(br.readLine());
        while(number_Of_TestCases-->0){

            String inputString = br.readLine();
            for(int i =0;i<inputString.length();i++){
                
                int count=0;
                if((i<inputString.length()-1 )&& ( inputString.charAt(i)-inputString.charAt(i+1)==1 ||
                inputString.charAt(i)-inputString.charAt(i+1)==-1)){
                    count++;
                }
                else{
                    System.out.println("NO");
                    break;
                }
                if(count==inputString.length()){
                    System.out.println("YES");
                }

            }

        }
    }
}