import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String nk[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		long arr[] = new long[n];
		String str[] = br.readLine().split(" ");
		
		for(int i =0;i<n;i++)
		{
			arr[i] = Long.parseLong(str[i]);
		}
			
		int bits[] = new int[32];
		
		for(int i= 0;i<n;i++)
		{
			findBits(arr[i], bits);
		}
		
		int ans = 0;
		for(int i = 0;i<32;i++)
		{
			if(bits[i] == 0)continue;
			if(bits[i] % k == 0)
			{
				ans += (bits[i]/k);
				
			}
			else {
				ans +=  ((bits[i]/k) +1);
			}
		}
		
		
		System.out.println(ans);
	}
	public static void findBits(long n, int arr[])
	{
		String s ="";
		while(n > 0)
		{
			s += (n%2);
			n /=2;
		}
		
		int len = s.length();
		int j = 31;
		for(int i = 0;i<len;i++)
		{
			if(s.charAt(i) == '1')
			{
				arr[j]++;
			}
			j--;
		}
	}
}