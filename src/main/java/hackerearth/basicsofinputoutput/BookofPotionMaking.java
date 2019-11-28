//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/sum-it-if-you-can-4867f851/description/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookofPotionMaking{

    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer key = Integer.parseInt(br.readLine());

        

     int f=   recurse(key,0,key,10);
    if(f%11==0){
        System.out.println("Legal ISBN");
    }
    else{
        System.out.println("Illegal ISBN");
    }
        
    }

    private static int recurse(Integer key,Integer sum,int temp,int add) {

        if(temp>0){
             temp=key/10;
            key=key%10;
            System.out.println(key);
            sum = sum+key*add--;
         return   recurse(temp, sum,temp,add);
           

          
       
           
        }
        
        return sum;
        
      
    }


}