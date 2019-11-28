//https://www.hackerearth.com/practice/data-structures/disjoint-data-strutures/basics-of-disjoint-data-structures/practice-problems/algorithm/count-friends/


package hackerearth.disjointdatastractures;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class CountFriends{

    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        DisSet ds=new DisSet(N+1);
        for(int i=0;i<M;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
           ds.weightedunion(u, v);
        }
        for (int i = 1; i < N+1; i++) {
            out.print(ds.setSize(i)-1+" ");
        }
        out.close();

    }
    static class DisSet{
        int Arr[],size[];
        DisSet(int n){
            Arr=new int[n];
            size=new int[n];
            for (int i = 0; i < n; i++) {
                Arr[i]=i;
                size[i]=1;
            }
        }
        int root(int i)
        {
            while(Arr[ i ] != i)
            {
                Arr[ i ] = Arr[ Arr[ i ] ] ;
                i = Arr[ i ];
            }
            return i;
        }
 
        int setSize(int x){
            return size[root(x)];
        }
 
        void weightedunion(int A,int B){
 
            int root_A = root(A);
            int root_B = root(B);
            if(root_A==root_B)
                return;
            if(size[root_A] < size[root_B ])
            {
                Arr[ root_A ] = Arr[root_B];
                size[root_B] += size[root_A];
            }
            else
            {
                Arr[ root_B ] = Arr[root_A];
                size[root_A] += size[root_B];
            }
//            System.out.println(Arrays.toString(Arr)+"\n"+Arrays.toString(size));
        }
    }
    static private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    static class InputReader {
 
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
 
        public String readString() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        public String nextLine() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }
 
        public double nextDouble() {
            return (Double.parseDouble(readString()));
        }
 
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
 
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}