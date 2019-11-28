//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/two-strings-4/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TwoStrings{

    public static void main(String[] args) throws Exception {
        HashMap<Character,Integer> map1=  new HashMap<>();
        map1.put('a', 1);
        map1.put('b', 232);
        HashMap<Character,Integer> map2=  new HashMap<>();
        map2.put('a', 1);
        map2.put('b', 2);
        System.out.println(map1.equals(map2));
        

    }
}