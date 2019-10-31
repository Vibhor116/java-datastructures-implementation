//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/magical-word/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MagicalWord{

    public static void main(String[] args) throws Exception {

        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        Integer totalTestCases  = Integer.parseInt(br.readLine());
        for(int i=0;i<totalTestCases;i++){
            Integer strLen  = Integer.parseInt(br.readLine());
            String str_Arr[] =  new String[strLen];
            for(int j=0;j<str_Arr.length;j++){
                str_Arr[j] = br.readLine().split("\\s+")[j];
            }
        }
    }
}