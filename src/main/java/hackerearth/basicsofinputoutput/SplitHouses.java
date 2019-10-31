//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class SplitHouses{

    public static void main(String[] args) throws Exception{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Integer  number_Of_Grids= Integer.parseInt(br.readLine());
        String lineitems = br.readLine();
        int i=0;
        for(i=0;i<lineitems.length();i++){
            
            if(lineitems.charAt(i)=='H' && lineitems.charAt(i+1)=='H'){
                break;
            }
           
        }
        if(i==lineitems.length()){
            System.out.println("YES");
            System.out.println(lineitems.replaceAll(".", "B"));
        }
        else{
            System.out.println("NO");
        }

    }
}