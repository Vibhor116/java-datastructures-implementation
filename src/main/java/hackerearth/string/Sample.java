package hackerearth.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.xml.soap.MimeHeader;

public class Sample{

    public static void main(String[] args) throws Exception{
 
        int arr[]   ={1,2,3,4,5};
        int k=3;
        for(int i=0;i<k;i++){
            

            int temp =arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){

                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));

        }
    
}