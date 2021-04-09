import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];
			int holder[][] = new int[n][n];
			for(int i=0;i<n;i++)
			{
				String s[]= br.readLine().split(" ");
				for(int j =0;j<s.length;j++)
				{
					arr[i][j] = Integer.valueOf(s[j]);
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j =0;j<n;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
					System.out.println();
			}
			boolean flag = true;
			int count =0;
			while(flag)
			{
				flag = false;
				
				for(int i=n-1;i>0;i--)
				{
					if(arr[i][0] < arr[i-1][n-1]){
						flag = true;
						count++;
						transpose(arr,i,holder);
						break;
					}
				}
			}
		}
	}
	public static void transpose(int arr[][],int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int j = 0;j<=n;j++)
			{
				int a = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = a;
			}
		}
				
		for(int i=0;i<=n;i++)
			{
				for(int j =0;j<=n;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
					System.out.println();
			}
		
	}
}