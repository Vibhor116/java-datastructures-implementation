//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/duration/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Duration {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer numer_works = Integer.parseInt(br.readLine());

        for (int i = 0; i < numer_works; i++) {
            String input_Arr[] = br.readLine().split("\\s+");
            int final_Arr[] = new int[input_Arr.length];

            for (int j = 0; j < final_Arr.length; j++) {
                final_Arr[j] = Integer.parseInt(input_Arr[j]);
            }
           
            int SH= final_Arr[0];
            int SM= final_Arr[1];
            int EH= final_Arr[2];
            int EM= final_Arr[3];
             int abs_val=Math.abs(EM-SM);
             int final_MM = 60-abs_val;
             int final_HH= EH-SH-1;
             
             System.out.println(final_HH+" "+final_MM);

            
        }

    }
}