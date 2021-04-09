import java.util.*;
import java.util.*;
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
			String arr[] = br.readLine().split(" ");
			
			long n = Long.parseLong(arr[0]);
			long e = Long.parseLong(arr[1]);
			long h = Long.parseLong(arr[2]);
			long a = Long.parseLong(arr[3]);
			long b = Long.parseLong(arr[4]);
			long c = Long.parseLong(arr[5]);
			long ans  = getDish(n,e,h,a,b,c);
			if(ans == (long)1e15)
			{
				System.out.println(-1);
			}else
			{
				
				System.out.println(ans);
			}
		}
	}
	public static long getDish(long n, long e, long h ,long a ,long b ,long c)
	{
		if(n <= 0)return 0;
		
		long ans = (long)1e15;
		
		if(n <= e && n<= h)
		{
			ans = Math.min(ans, n*c);
		}
		if(3 * n <= h)
		{
			ans = Math.min(ans, n*b);
		}
		if(2 * n <= e)
		{
			ans = Math.min(ans, n*a);
		}
		if((h - n) / 2 >= 1 && ((h-n) / 2 >= n-e))
		{
			if(b - c <  0)
			{
				long temp = Math.min(n -1,(h-n)/2);
				ans = Math.min(ans,(b -c) *temp + n*c);
			}
			else
			{
				long temp = Math.max(1, n-e);
				ans = Math.min(ans , (b- c)* temp + n*c);
			}
			
		} 
		if(e-n >= 1 && e-n >= n-h)
		{
			if(a-c <0)
			{
				long temp = Math.min(n -1,e -n);
				ans = Math.min(ans,(a -c) *temp + n*c);
			}
			else
			{
				long temp = Math.max(1,n- h);
				ans = Math.min(ans,(a -c) *temp + n*c); 
			}
		}
		
		if((e /2 >= 1) && (e/2 >= (3*n - h + 2)/3))
		{
			if(a-b <0)
			{
				long temp = Math.min(n -1,e/2);
				ans = Math.min(ans,(a -b) *temp + n*b);
			}
			else
			{
				long temp = Math.max(1,(3*n - h + 2)/3);
				ans = Math.min(ans,(a - b) *temp + n*b); 
			}
			
		}
		if((e>= 3) && (h >= 4) && (n >= 3))
		{
			ans = Math.min(ans, a + b + c + getDish(n-3,e-3,h-4,a,b,c));
		}
		
		return ans;
		
	}
}