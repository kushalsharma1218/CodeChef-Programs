
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
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
 
	public static void main(String ar[])
	{
		FastReader s = new FastReader();
        int t = s.nextInt();
		while(t-- > 0){
			int n = s.nextInt();
			int q = s.nextInt();
			
			int graph[][] = new int[n+1][n+1];
			
			for(int i = 0;i<=n;i++)Arrays.fill(graph[i], Integer.MAX_VALUE);
			for(int i = 0;i<=n;i++)graph[i][i] = 0;
			for(int i = 0;i<n-1;i++)
			{
				int u = s.nextInt();
				int v = s.nextInt();
				
				graph[u][v] = 1;
				graph[v][u] = 1;
			}
			
			for(int i = 1;i<= n;i++)
			{
				bfs(i, i, graph);
			}
			
			while(q-- > 0)
			{
				int sum = 0;
				int u = s.nextInt();
				int v = s.nextInt();
				
				for(int k = 1;k<=n;k++)
				{
					sum +=  Math.min(graph[k][u], graph[k][v]);
				}
				
				System.out.println(sum);
			}
			
		}
		
	}
	public static void bfs(int node, int parent, int graph[][])
	{
		Queue<Pair> queue new LinkedList<>();
		graph[node][parent] = 0;
		
		queue.add(new Pair(node, 0));
		
		while(!queue.isEmpty())
		{
			Pair curr = queue.poll();
			
			int currNode = curr.node;
			int steps = 
			
		}
	}
}
class Pair{
	int node;
	int step;
	
	Pair(int node, int step)
	{
		this.node  = node;
		this.step = step;
	}
}
