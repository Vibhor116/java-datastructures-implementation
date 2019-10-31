//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/fight-for-laddus/

package hackerearth.stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FightForLaddus {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer totalTestCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < totalTestCases; i++) {
            Integer testsCount = Integer.parseInt(br.readLine());
            int compute_arr[] = new int[testsCount];
            String finalArr[] = br.readLine().split("\\s+");

            for (int k = 0; k < compute_arr.length; k++) {
                compute_arr[k] = Integer.parseInt(finalArr[k]);
            }
            //
         
            Map<Integer, Integer> myMap = new TreeMap<>();
            for (int fin = 0; fin < compute_arr.length; fin++) {
                Integer finValue = myMap.get(compute_arr[fin]);
                if (finValue != null) {
                    myMap.put(compute_arr[fin], finValue + 1);
                } else {
                    myMap.put(compute_arr[fin], 1);
                }
            }
            int freq[] = new int[compute_arr.length];
            int f = 0;
            for(int val=0;val<compute_arr.length;val++){
                freq[val] = myMap.get(compute_arr[val]);
            }
            System.out.println(Arrays.toString(freq));
            StringBuffer res = new StringBuffer();
            for(int a=0;a<freq.length;a++){
                int f11=0;
                for(int j =a+1;j<compute_arr.length;j++){
                    if(compute_arr[j]>freq[a]){
                        res.append(freq[a]);
                       f11=1; 
                        break;
                    }
                }
                if(f11==0){
                    res.append("-1"+" ");
                }
            }
            System.out.println(res+"@");
        }
    }
}