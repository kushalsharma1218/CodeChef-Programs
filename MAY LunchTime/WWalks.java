import java.io.*;
import java.util.*;
class Codechef
{
	public static void main(String ar[]) throws Exception
	{
		
		InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = in.nextInt();
		
		for(int t=0;t<test;t++)
		{
			int N = in.nextInt();
			// int N = Integer.parseInt(br.readLine().trim());
			int alice[] =in.nextIntArray(N);
			int bob[] =in.nextIntArray(N);
			// int bob[] =new int[N];
			// String ALICE[] = br.readLine().split(" ");
			// String BOB[] = br.readLine().split(" ");
		/* 	for(int i=0;i<N;i++)
			{
				alice[i]=Integer.parseInt(ALICE[i]);
			}
			for(int i=0;i<N;i++)
			{
				bob[i]=Integer.parseInt(BOB[i]);
			}
		 */	
			int sum=0;
			int sourceA=0;
			int sourceB=0;
			for(int i=0;i<N;i++)
			{
				if(alice[i]==bob[i] && sourceA==sourceB){
				    sum=sum+alice[i];
				    sourceA=0;
				    sourceB=0;
				    
				}
				sourceA+= alice[i];
				sourceB+= bob[i];
			}
			System.out.println(sum);
		}
		w.close();
	}
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