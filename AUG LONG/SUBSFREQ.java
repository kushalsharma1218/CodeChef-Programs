import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
	
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String s1[] = br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(s1[i]);
			}
			sequence(arr,n);
		
	}
	}
	public static void sequence(int arr[],int n)
	{
		String set[] = new String[n];
		for(int i=0;i<n;i++)
		{
			set[i] = ""+arr[i];
		}
		
		printSubsets(set);
	}
		
	static void printSubsets(String set[]) 
	{
		int n = set.length; 
        
		for (int i = 0; i < (1<<n); i++) 
		{	
			int res = Integer.MIN_VALUE;
			for (int j = 0; j < n; j++) 
				if ((i & (1 << j)) > 0) 
					res = Math.max(res,Integer.parseInt(set[j]));
			System.out.print(res+" ");
                     
  
        } 
    } 
}