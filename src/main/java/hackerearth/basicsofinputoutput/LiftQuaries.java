// /https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/lift-queries/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LiftQuaries{

    public static void main(String[] args) throws Exception {
        
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Integer T = Integer.parseInt(br.readLine());
        int lowerFloor = 0;
        int upperFloor =7;
    
        for(int i=0;i<T;i++){

            Integer floorNumber = Integer.parseInt(br.readLine());
            int lower = Math.abs(lowerFloor-floorNumber);
            int upper = Math.abs(upperFloor-floorNumber);
            if(lower<=upper){
                System.out.println("A");
                lowerFloor=floorNumber;
               
            }
            else{
                System.out.println("B");
                upperFloor=floorNumber;
            }
			
        }
    }
}