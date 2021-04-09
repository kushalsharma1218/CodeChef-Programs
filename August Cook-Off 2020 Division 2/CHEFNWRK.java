import java.io.*;
class Test
{
	public static void main(String arfd[]) throws Exception
	{
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			String s1[] = br.readLine().split(" ");

			int n = Integer.parseInt(s1[0]);
			int k = Integer.parseInt(s1[1]);
			
			String s[] = br.readLine().split(" ");
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(s[i]);
			}
			System.out.println(rounds(n,arr,k));
	}
	}
	static int rounds(int n, int ar[], int k)
	{
		if(ar[0] > k)
			return -1;
		int count = 0;
		int sum = 0;
		int i=0;
		while(i<n)
		{
			while(i < n && sum < k)
			{
				sum += ar[i];
				i++;
			}
			if(sum > k)
			{
				if(ar[i-1] > k)
				{
					return -1;
				}
				sum = 0;
				i--;
			}
			else if(sum ==k)
			{
				sum=0;
				
			}
			 if(i==n)
			{
				
				return ++count;
			}
				count++;
			
		}
		
		
		return count;
	}
	
}