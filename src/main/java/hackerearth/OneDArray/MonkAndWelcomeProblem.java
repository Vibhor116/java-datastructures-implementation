package hackerearth.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import org.omg.CORBA.INTF_REPOS;

public class MonkAndWelcomeProblem{

    public static void main(String[] args) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer num = Integer.parseInt(br.readLine());
    String [] arr1= br.readLine().split("\\s+");
    String [] arr2= br.readLine().split("\\s+");
    int final_Arr[] =new int[num];
    for(int i=0;i<num;i++){
        final_Arr[i]=Integer.parseInt(arr1[i])+Integer.parseInt(arr2[i]);
        
    }
   StringBuilder sb = new StringBuilder();
    for(int k=0;k<final_Arr.length;k++){

        sb.append(final_Arr[k]);
        if(k<final_Arr.length-1)
        sb.append(" ");
    }
System.out.println(sb.toString());
    }
}