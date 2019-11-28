
package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/doctors-secret/

public class DoctorSecret{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_arr[]=br.readLine().split("\\s+");
        int final_arr[] = new int[input_arr.length];
        for(int i=0;i<final_arr.length;i++){
            final_arr[i]= Integer.parseInt(input_arr[i]);
        }
        int p1=final_arr[0];
        int p2=final_arr[1];

        if(p1<=23 && (p2>=500 && p2<=1000)){
            System.out.println("Take Medicine");
        }
        else{
            System.out.println("Don't take Medicine");
        }

        
    }
}