
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long mod = 1000000007;
		String str[] = br.readLine().split(" ");
		long sum = 0;
		long arr[] = new long[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = Long.parseLong(str[i]);
			
			if(arr[i] < 0)
			{
				sum = (sum % mod + (arr[i]+mod)%mod)%mod;
			}
			else
			sum = (sum%mod + arr[i]%mod)%mod;
		}
		int q = Integer.parseInt(br.readLine());
		String qu[] =br.readLine().split(" ");
		while(q-- > 0)
		{
			sum = (sum % mod + sum%mod)%mod;
			System.out.println(sum);
		}
	}
}