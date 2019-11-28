//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/


package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToogleString{

    public static void main(String[] args) throws Exception {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        String input_String =br.readLine();
       StringBuilder sb = new StringBuilder();
        for(int i=0;i<input_String.length();i++){
            if(input_String.charAt(i)>=97 && input_String.charAt(i)<=122){
              sb.append(Character.toChars(input_String.charAt(i)-32));
            }

            if(input_String.charAt(i)>=65 && input_String.charAt(i)<=90){
                sb.append(Character.toChars(input_String.charAt(i)+32));
            }
        }

        System.out.println(sb.toString());
    }
}