//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/e-maze-in-1aa4e2ac/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmazeIn{

    public static void main(String[] args) throws Exception{
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        String mazeMoves  =  br.readLine();
        int xAxis=0;
        int yAxis =0;
        for(int i =0 ;i<mazeMoves.length();i++){
            if(mazeMoves.charAt(i)=='L'){
                xAxis=xAxis-1;
            }
            if(mazeMoves.charAt(i)=='R'){
                xAxis=xAxis+1; //LLRDDR
            }
            if(mazeMoves.charAt(i)=='U'){
                yAxis=yAxis+1;
            }
            if(mazeMoves.charAt(i)=='D'){
                yAxis=yAxis-1;
            }
        }
        System.out.println(xAxis+" "+yAxis);
    }
}