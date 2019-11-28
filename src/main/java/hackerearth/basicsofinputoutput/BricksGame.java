//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/bricks-game-5140869d/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BricksGame{

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer key = Integer.parseInt(br.readLine());

        int m=1;
        int p=1;
        for(int i=1;i<=key;i++){
            m=i*1;
            p=i*2;
        }
        System.out.println(m);
        System.out.println(p);
       

    }
}