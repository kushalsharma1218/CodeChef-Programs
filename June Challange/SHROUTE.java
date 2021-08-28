import java.util.*;
import java.io.*;
class A
{
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
		
		FastReader s = new FastReader();
		
		int t = s.nextInt();
		
		while(t-- > 0)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			

			
			int platforms[] = new int[n];
			int trv[] = new int[m];
			
			for(int i =0;i<n;i++)
			{
				platforms[i] = s.nextInt();
				
			}
			
			for(int i = 0;i<m;i++)
			{
				trv[i] = s.nextInt() -1;
				
			}
			
			int right[] = new int[n];
			int left[] = new int[n];
			
			Arrays.fill(right, -2);
			Arrays.fill(left, -2);
			right[0] = left[0] = -1;
			
			for(int i = 0;i<n;i++)
			{
				if(platforms[i]  != 0)
				{
					right[i] = left[i] = -1;
				}
			}
			
			
			int rec = -1;
			if(platforms[0] == 1)rec = 0;
			for(int i = 1;i<n;i++)
			{
				if(platforms[i] == 1)
				{
					rec = i;
				}
				
				if(rec != -1 && right[i] != -1)
				{
					right[i] = rec;
				}
			}
			
			rec = -1;
			
			for(int i = n-1;i>=0;i--)
			{
				if(platforms[i] == 2)
				{
					rec = i;
				}
				
				if(rec != -1 && left[i] != -1)
				{
					left[i] = rec;
				}
			}
			
			int ans[] = new int[m];
			Arrays.fill(ans, -1);
			for(int i = 0;i<m;i++)
			{
				int dest = trv[i];
				if(platforms[dest] != 0){
					ans[i] = 0;
					continue;
				}
				
				int l = right[dest];
				int r = left[dest];
				
				if(l == -2 && r == -2)continue;
				if(l == -2)
				{
					ans[i] = Math.abs(dest - r);
				}
				else if(r == -2){
					ans[i] = Math.abs(dest - l);
				}
				else
				ans[i] = Math.min(Math.abs(dest - l), Math.abs(dest - r));
				
			}
			
			for(int i = 0;i<m;i++){
				System.out.print(ans[i]+" ");
			}
			System.out.println();
		}
	}
}