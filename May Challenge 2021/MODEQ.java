import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String nm[] = br.readLine().split(" ");
			int n =Integer.parseInt(nm[0]);
			int m =Integer.parseInt(nm[1]);
			int arr[] = new int[n+1];
			int count = 0;
			Arrays.fill(arr, 1);
			for(int i =2;i<=n;i++)
			{
				int a = m % i;
				count += arr[a];
			
				for(int j = a;j<=n;j+=i)
				{
					arr[j] += 1;
				}
			}
		
			System.out.println(count);
		}
	}
}