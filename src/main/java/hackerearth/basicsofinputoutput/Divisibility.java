//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Divisibility {

    public static void main(String[] args) throws Exception {

      

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer totalSize = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("\\s+");
        int final_Arr[] = new int[totalSize];
        for (int i = 0; i < final_Arr.length; i++) {
            final_Arr[i] = Integer.parseInt(arr[i]);
        }
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < final_Arr.length; i++) {
           sb.append(final_Arr[i]%10);
         }
        
    if((Integer.valueOf(arr[totalSize-1]))%10==0){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }

    }
}