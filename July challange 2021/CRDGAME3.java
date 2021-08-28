import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			long arr[] = new long[n];
			
			for(int i = 0;i<n;i++)
			{
				arr[i] = Long.parseLong(str[i]);
			}
			
			long gcd = findGCD(arr);
			
			long count = 0;
			long max = 0;
			for(int i = 0;i<n;i++)
			{
				long num = arr[i]/gcd;
				max = Math.max(num, max);
				count += num;
			}
			
			count =count - max +1;
			System.out.println(count);
			
		}
		
	}
	public static long findGCD(long arr[])
	{
		long res = arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			res = gcd(arr[i], res);
			if(res == 1)return 1;
		}
		return res;
	}
	public static long gcd(long a, long b)
	{
		if(a == 0)return b;
		else return gcd(b % a, a);
	}
}