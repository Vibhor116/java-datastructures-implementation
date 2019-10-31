//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/
package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BestIndex{

    public static void main(String[] args) throws Exception {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        Integer totalSize = Integer.parseInt(br.readLine());
        int final_Arr[]=  new int[totalSize];

        for(int i=0;i<final_Arr.length;i++){
            final_Arr[i]= Integer.parseInt(br.readLine().split("\\s+")[i]);
        }
        
    }
}