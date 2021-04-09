import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main(String ar[]) throws Exception
	{
		FastReader sc = new FastReader();
		 int t = sc.nextInt();
		while(t-- > 0){
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			boolean vis[]= new boolean[m];
			
			boolean p = true;
			for(int i =0;i<m;i++)
			{
				int x = sc.nextInt();
				if(set.contains(x))
				{
					System.out.println("YES");
					p = false;
				}
				set.add(x);
			}
			// for(int i =0;i<m;i++)
			// {
				// if(vis[i] == false)
				// {
					// p = false;
					// System.out.println("YES");
					// break;
				// }
			// }
			
			if(p)System.out.println("NO");
			
			
			
		}
		

	}
 
 }