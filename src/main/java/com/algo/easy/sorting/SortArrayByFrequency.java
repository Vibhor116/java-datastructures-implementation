//http://www.geeksforgeeks.org/sort-elements-by-frequency/

package com.algo.easy.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByFrequency{

    class SortNode{
         int count;
         int firstIndex;
    }

    class FrequencyComparator implements Comparator<Integer>{
        
        private Map<Integer,SortNode> countMap=null;
        FrequencyComparator(Map<Integer,SortNode> countMap){
            this.countMap = countMap;
        }
       @Override
       public int compare(Integer i1, Integer i2) {
        SortNode n1 = countMap.get(i1);
        SortNode n2 = countMap.get(i2);
        if(n1.count > n2.count){
            return -1;
        }else if(n1.count < n2.count){
            return 1;
        }else{
            return n1.firstIndex < n2.firstIndex ? -1 : 1;
        }
       } 
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input_Arr= br.readLine().split("\\s+");

        Integer final_Arr[] = new Integer[input_Arr.length];

        for(int i=0;i<final_Arr.length;i++){
            final_Arr[i]=Integer.parseInt(input_Arr[i]);
        }
        new SortArrayByFrequency().sortArrayByFrequency(final_Arr);

    }

      void sortArrayByFrequency(Integer[] final_Arr) {
        Map<Integer,SortNode> countMap = new HashMap<Integer,SortNode>();
        int index = 0;
        for(int a : final_Arr){
            if(countMap.containsKey(a)){
                SortNode s = countMap.get(a);
                s.count++;
            }
            else{
                SortNode s = new SortNode();
                s.count = 1;
                s.firstIndex = index;
                countMap.put(a, s);
            }
            index++;
        }
        
        FrequencyComparator freqComparator = new FrequencyComparator(countMap);
        Arrays.sort(final_Arr,freqComparator);
    }
}
