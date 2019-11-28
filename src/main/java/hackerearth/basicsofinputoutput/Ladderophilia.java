package  hackerearth.basicsofinputoutput;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// /https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/ladderophilia/

public class Ladderophilia{

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numberTestCaeses= br.readLine();
int sum=0;
        for(int i=0;i<numberTestCaeses.length();i++){
          
            int num = numberTestCaeses.charAt(i)-96;
           sum=sum+num;
        }
        System.out.println(sum);
       
    }
}