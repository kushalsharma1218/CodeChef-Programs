import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			long k =Long.parseLong(s[1]);
			
			long arr[] = new long[n];
			String s1[] = br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				arr[i]= Long.parseLong(s1[i]);
			}
			
			System.out.println(chefChess(arr,n,k));
		
			
		}
	}
	public static long chefChess(long arr[],long n,long k)
	{
		long curr_multiple =(long) Integer.MAX_VALUE;
		long res = -1L;
		for(int i=0;i<n;i++)
		{
			long div = -1;
			if(k % arr[i] == 0)
			{
				div = k/arr[i];
			}
			if(curr_multiple>div && div!= -1L)
			{
				curr_multiple = div;
				res = arr[i];
			}
		}
		return res;
	}
}