//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/a-game-of-numbers-1-5d3a8cb3/

package hackerearth.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AGameofNumbers{

    public static void main(String[] args) throws Exception {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        Integer totalTestCases=Integer.parseInt(br.readLine());
        long arr[]=new long[totalTestCases];
        for(int i =0;i<totalTestCases;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
    }
}