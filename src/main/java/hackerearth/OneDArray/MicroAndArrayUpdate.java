package hackerearth.OneDArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MicroAndArrayUpdate{

public static void main(String[] args) throws Exception{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer num=  Integer.parseInt(br.readLine());
    for(int i =0 ;i<num;i++){
        String N_K[]= br.readLine().split("\\s+");

        int n =Integer.parseInt(N_K[0]);

        int k =Integer.parseInt(N_K[1]);
        String values[]= br.readLine().split("\\s+");
        Arrays.sort(values);
        System.out.println(k-min);

    }

}
}