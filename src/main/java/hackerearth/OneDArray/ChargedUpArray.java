//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/charged-up-array-f35a5e23/

package hackerearth.OneDArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChargedUpArray{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }

            int out_ = solve(A,N);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }

    private static int solve(long[] A, int N) {
        long numberOfSubset = (long)Math.pow(2, N-1);
        long sum = 0;
        // System.out.println("Number of Subset: "+numberOfSubset);
        for(int i =0; i<N; i++){
        if(A[i]>=numberOfSubset)
        sum+=A[i];
        }
        return (int)(sum%1000000007);
    }
}