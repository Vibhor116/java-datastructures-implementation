package hackerearth.basicsofinputoutput;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/back-to-school-1/

public class BackToSchool {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("\\s+");
        int final_Arr[] = new int[arr.length];
        for (int i = 0; i < final_Arr.length; i++) {
            final_Arr[i] = Integer.parseInt(arr[i]);
        }
        int max=final_Arr[0];
        for (int i = 1; i < final_Arr.length; i++) {
           if(final_Arr[i]>max){
               max=final_Arr[i];
           }
        }
        System.out.println(max);
    }

}