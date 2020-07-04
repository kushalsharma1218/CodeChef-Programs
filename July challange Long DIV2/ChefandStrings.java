import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{	
			int n = Integer.parseInt(br.readLine());
			String s[] = br.readLine().split(" ");
			
			long arr[] = new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.valueOf(s[i]);
			}
			long num = pluckString(arr,n);
			
			System.out.println(num);
		}
	}
	public static long pluckString(long arr[], int n)
	{
		long sum =0;
		for(int i=0;i<n-1;i++)
		{
			if(Math.abs(arr[i]-arr[i+1]) != 0)
			sum = sum + Math.abs(arr[i]-arr[i+1]) -1;
	
		}
		
		return sum;
	}
}