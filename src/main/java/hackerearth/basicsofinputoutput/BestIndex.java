//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/
package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BestIndex{

    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String sLength = br.readLine(); 
            String[] content = br.readLine().trim().split(" ");
            Double[] d = new Double[Integer.parseInt(sLength)];
            int j = 0;
            for(int i = 0; i < content.length; i++){
                if(content[i].trim().length() > 0){
                    d[j] = Double.parseDouble(content[i]);
                    j++;
                }
            }
            Double result = findBestIndexSum(d);
            System.out.println(result.longValue());
        }
        public static Double findBestIndexSum(Double[]arr){
            Double maxSum = -10e7;
            Double[] sums = new Double[arr.length];
            sums[0] = arr[0];
            for(int i = 1; i < arr.length; i++){
                sums[i] = sums[i - 1] + arr[i];
            }
            for(int i = 0; i < arr.length; i++){
                int lastIndex = i;
                int size = 1;
                Double newSum;
                while(true){
                    size++;
                    if(lastIndex + size >= arr.length){
                        break;
                    }
                    lastIndex += size;
                }
                if(i > 0)
                    newSum = sums[lastIndex] - sums[i-1];
                else
                    newSum = sums[lastIndex];
                maxSum = maxSum < newSum? newSum: maxSum;
            }
            return maxSum;
        }
    }