//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisibe-or-2d8e196a/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Divisible{

    public static void main(String[] args ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer totalSize = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("\\s+");
        int final_Arr[] = new int[totalSize];
        for (int i = 0; i < final_Arr.length; i++) {
            final_Arr[i] = Integer.parseInt(arr[i]);
        }
        int first_Arr []= new int[(totalSize+1)/2];
        int second_Arr []= new int[totalSize-first_Arr.length];
System.out.println(second_Arr.length+"-");
        System.arraycopy(final_Arr, 0, first_Arr, 0, first_Arr.length);
        System.arraycopy(final_Arr, first_Arr.length, second_Arr, 0, second_Arr.length);
        StringBuilder sb =  new StringBuilder();
       System.out.println(Arrays.toString(first_Arr));
       System.out.println(Arrays.toString(second_Arr));

        for(int j=0;j<first_Arr.length;j++){
            int digits = (int)(Math.log10(first_Arr[j])); 
      
            // Find first digit 
            int first_digit = (int)(final_Arr[j] / (int)(Math.pow(10, digits))); 
            sb.append(first_digit);
        }
        for(int k=0;k<second_Arr.length;k++){
            int last_digit =        second_Arr[k]%10;   
              sb.append(last_digit);
        }
        System.out.println(sb.toString());
       boolean chk= check(sb.toString());
       if(chk==true){
           System.out.println("OUI");
       }
       else{
           System.out.println("NAN");
       }
    }

    static boolean check(String str) 
    { 
        int n = str.length(); 
       
        // Compute sum of even and odd digit 
        // sums 
        int oddDigSum = 0, evenDigSum = 0; 
        for (int i=0; i<n; i++) 
        { 
            // When i is even, position of digit is odd 
            if (i%2 == 0) 
                oddDigSum += (str.charAt(i)-'0'); 
            else
                evenDigSum += (str.charAt(i)-'0'); 
        } 
       
        // Check its difference is divisble by 11 or not 
        return ((oddDigSum - evenDigSum) % 11 == 0); 
    } 
}