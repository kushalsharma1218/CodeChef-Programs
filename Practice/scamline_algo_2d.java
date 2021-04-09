import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int u = sc.nextInt();
		int q = sc.nextInt();
		
		int arr[][] = new int[n][m];
		
		for(int i =0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int pref[][] = new int[n+1][m+1];
		for(int i =0;i<n;i++)
		{
			pref[i][0] = arr[i][0];
			pref[i][m] = 0;
		}
		
		for(int i =0;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				pref[i][j] = arr[i][j] - arr[i][j-1];
			}
		}
		while(u-->0)
		{
			int k = sc.nextInt();
			int r1 = sc.nextInt();
			int c1 = sc.nextInt();
			int r2 = sc.nextInt();
			int c2 = sc.nextInt();
			
			
			// pref[r1][c1] += k;
			
			// if(c2+1 < m+1)pref[r1][c2+1] -= k;
			// if(r2 +1< n+1 && c2+1 < m+1)pref[r2 + 1][c2+1] -= k;
			// if(r2+1 < n+1)pref[r2+1][c1] -= k;
			
			for(int i = r1; i <= r2; i++) 
			{
				pref[i][c1] += k; 
				pref[i][c2 + 1] -= k; 
			}
			
		}
		
		

		for(int i =0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				if(j== 0)
				{
					arr[i][j] = pref[i][j];
				}
				else
				{
					arr[i][j] = pref[i][j] + arr[i][j-1];
				}
				
				// System.out.print(arr[i][j]+" ");
			}
			// System.out.println();
		}
		generatePrefix(arr);
		
		while(q-- >0)
		{
			int r1 = sc.nextInt();
			int c1 = sc.nextInt();
			int r2 = sc.nextInt();
			int c2 = sc.nextInt();
			
			int sum = arr[r2][c2];
			if(c1 > 0)sum -= arr[r2][c1-1];
			if(r1 >0)sum -= arr[r1-1][c2];
			if(r1 > 0 && c1 >0)sum += arr[r1-1][c1-1];
			
			System.out.println(sum);
			
		}
	}
	public static void generatePrefix(int arr[][])
	{
		for(int i =0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				int p_sum = arr[i][j];
				if(i>0)p_sum += arr[i-1][j];
				if(j>0)p_sum += arr[i][j-1];
				if(i>0 && j>0)p_sum -= arr[i-1][j-1];
			
				arr[i][j] = p_sum;
			}
		}
	}
}