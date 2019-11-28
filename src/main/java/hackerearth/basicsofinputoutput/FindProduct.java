//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindProduct{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(br.readLine());
        String[] input_Array = br.readLine().split("\\s+");
        int[] final_Array = new int[num];
        for (int i = 0; i < final_Array.length; i++) {
            final_Array[i] = Integer.parseInt(input_Array[i]);
        }
        double multi=1;
        for(int i=0;i<final_Array.length;i++){
            multi=(multi*final_Array[i])%(Math.pow(10, 9)+7);
        }
        System.out.println((int)multi);
        
    }
}