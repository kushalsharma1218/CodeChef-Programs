import java.util.*;

import java.io.*;

class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String rcx[] = br.readLine().split(" ");
			int r = Integer.parseInt(rcx[0]);
			int c = Integer.parseInt(rcx[1]);
			int x = Integer.parseInt(rcx[2]);
			
			int arr[][] = new int[r][c];
			int arr2[][] = new int[r][c];
			
			int suma =0;
			int sumb =0;
			for(int i=0;i<r;i++)
			{
				String str[] = br.readLine().split(" ");
				for(int j = 0;j<c;j++)
				{
					arr[i][j] = Integer.parseInt(str[j]);
					suma += arr[i][j];
				}
			}
			
			for(int i=0;i<r;i++)
			{
				String str[] = br.readLine().split(" ");
				for(int j = 0;j<c;j++)
				{
					arr2[i][j] = Integer.parseInt(str[j]);
					sumb += arr2[i][j];
				}
			}
			
			if(x == 2 && false)
			{
				int pathsum = 0;
				for(int i=0;i<r;i++)
				{
					for(int j = 0;j<c;j++)
					{
						int mul = 0;
						if((r-i+c-j) %2 == 0)mul =-1;
						else mul = 1;
						if(!(i == r-1 && j == c-1))pathsum += mul * (arr[i][j] - arr2[i][j]);
					}
				}
				if(arr[r-1][c-1] - pathsum == arr2[r-1][c-1])System.out.println("Yes");
				else System.out.println("No");
			}
			
			
			
			
			
		}
	}
}