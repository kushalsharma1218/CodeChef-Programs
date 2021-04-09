import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0)
		{
			int n = Integer.parseInt(br.readLine());
			long arr[] = new long[n];
			String str[] = br.readLine().split(" ");
			for(int i=0;i<str.length;i++)
			{
				arr[i] = Long.parseLong(str[i]);
			}
			
			Arrays.sort(arr);
			long n3 = arr[n-1];
			long n1 = arr[0];
			// long sum1 = 0;
			// long sum2 = 0;
			// long n2 = arr[1];
			
			// sum1 = (Math.abs(n1 - n2) + Math.abs(n2 - n3)+ Math.abs(n3 - n1);
			// n2 = arr[n-2];
			// sum2 =(Math.abs(n1 - n2) + Math.abs(n2 - n3)+ Math.abs(n3 - n1);
			
			// if(sum1 > sum2)
			System.out.println((arr[n-1] - arr[0] )* 2);
			// else
			// System.out.println(sum2);
		}
	}
}