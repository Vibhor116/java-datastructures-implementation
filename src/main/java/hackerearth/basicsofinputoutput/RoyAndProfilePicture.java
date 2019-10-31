//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/

package hackerearth.basicsofinputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoyAndProfilePicture{

    public static void main(String[] args) throws Exception {
      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));  
      Integer imageLength=  Integer.parseInt(br.readLine());
      Integer number_images=  Integer.parseInt(br.readLine());
      for(int i =0;i<number_images;i++){
  
        String [] input_arr = br.readLine().split("\\s+");
        
            Integer W= Integer.parseInt(input_arr[0]);
            Integer H= Integer.parseInt(input_arr[1]);
            if(W<imageLength || H<imageLength){
                System.out.println("UPLOAD ANOTHER");
            }
            else{
                if(W.equals(H)){
                    System.out.println("ACCEPTED");
                }
                else{
                    System.out.println("CROP IT");
                }
            }

        
      }

    }
}