import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String nmk[] = br.readLine().split(" ");
			int n = Integer.parseInt(nmk[0]);
			int m = Integer.parseInt(nmk[1]);
			long k = Long.parseLong(nmk[2]);
			
			long arr[][] = new long[n+1][m+1];
			for(int i = 0;i<n+1;i++)
			{
				arr[i][0] = 0;
			}
			for(int j = 0;j<m+1;j++)
			{
				arr[0][j] = 0;
			}
			for(int i = 1;i<=n;i++)
			{
				String str[] = br.readLine().split(" ");
				int ind = 0;
				for(int j = 1;j<=m;j++)
				{
					arr[i][j] = Integer.parseInt(str[ind++]); 
				}
			}
			for(int i = 0;i<=n;i++)
			{
				double prev = 0;
				for(int j=0;j<=m;j++){
					arr[i][j] += prev;
					prev = arr[i][j];
				}
			}
			for(int i = 0;i<=m;i++)
			{
				double prev = 0;
				for(int j = 0;j<=n;j++)
				{
					arr[j][i] +=prev;
					prev = arr[j][i];
				}
			}
			
			int min = Math.min(m,n);
			long ans = 0;
			for(int u = 1;u<=min;u++)
			{
				for(int i = u;i<=n;i++)
				{
					for(int j = u;j<=m;j++)
					{
						if((arr[i][j] + arr[i-u][j-u] - arr[i][j-u] - arr[i-u][j])/(u*u) >= k)ans++;
					}
				}
			}
			System.out.println(ans);
			
		}
	}
}