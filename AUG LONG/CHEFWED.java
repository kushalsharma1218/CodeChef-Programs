import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			Map<Integer,Integer> mp = new HashMap<>();
			int arr[] = new int[n];
			int arr2[][] = new int[n][n];
			
			String s1[] = br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(s1[i]);
			}
			for(int i=0;i<n;i++)
			{
				mp.clear();
				for(int j =i;j<n;j++)
				{
					arr2[i][j] =(j==0)?0:arr2[i][j-1];
					if(mp.containsKey(arr[j]))
					{
						if(mp.get(arr[j]) == 1)
							arr2[i][j]++;
						arr2[i][j]++;
					mp.put(arr[j],mp.get(arr[j])+1);
					}
					else
					mp.put(arr[j],1);
				}
			}
			int ans = Integer.MAX_VALUE;
			int table = 100;
			int dp[][] = new int[101][1001];
			 for(int i=0;i<=table;i++)
			 {
				for(int  j=0;j<=table;j++)
				{
					dp[i][j]=0;
				}
			 }
			for(int i=1;i<n+1;i++)
				dp[1][i]=arr2[0][i-1];
			for(int i=2;i<=table;i++)
			{
				dp[i][1]=0;
			}
			for(int i=2;i<=table;i++)
			{
				for(int j=2;j<=n;j++)
				{
					int best=Integer.MAX_VALUE;
				for(int p=1;p<j;p++)
				{
					best=Math.min(best,dp[i-1][p]+arr2[p][j-1]);
				}
            dp[i][j]=best;
				}
			}
			for(table =1;table<=100;table++)
			{
				ans=Math.min(table*k+dp[table][n],ans);
			}
			System.out.println(ans);
		}
	}
}
			
