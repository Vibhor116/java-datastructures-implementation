package hackerearth.basicsofinputoutput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/addition-aint-simple/

public class AdditionAintSimple{

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number =  Integer.parseInt(br.readLine());
       for(int  i=0;i<number;i++){
            String str = br.readLine();
            int left=0;
            int right = str.length()-1;
            StringBuilder sb = new StringBuilder();
            while(left<=right){
            int leftval = str.charAt(left)-96;
            int rightval = str.charAt(right)-96;
            int sum = leftval+rightval;
            if(sum<=26){
               sb.append(Character.toChars(sum+96)); 
            }
            else{
                sb.append(Character.toChars(sum+96-26)); 
            }
          
                left++;
                right--;
            
            }
            if(str.length()%2!=0)
            System.out.println(sb.toString()+sb.reverse().toString().substring(1));
            else
            System.out.println(sb.toString()+sb.reverse().toString());

        }

        // hello 
        // olleh 
    }
}