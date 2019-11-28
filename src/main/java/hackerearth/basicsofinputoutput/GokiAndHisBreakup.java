//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/tds-and-his-breakup/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GokiAndHisBreakup{

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer numberTestCaeses= Integer.parseInt(br.readLine());
        Integer threshold= Integer.parseInt(br.readLine());
        
        for(int i=0;i<numberTestCaeses;i++){
             if(Integer.parseInt(br.readLine())>threshold){
                System.out.println("YES");
             }
             else{
                System.out.println("NO");
        
             }
        }

        

        
    }
}

