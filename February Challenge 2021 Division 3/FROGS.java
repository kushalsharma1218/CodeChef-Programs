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
			int w[] = new int[n];
			String str[] = br.readLine().split(" ");
			for(int i=0;i<str.length;i++)
			{
				w[i] = Integer.parseInt(str[i]);
			}
			
			int L[] = new int[n];
			String str1[] = br.readLine().split(" ");
			for(int i=0;i<str1.length;i++)
			{
				L[i] = Integer.parseInt(str1[i]);
			}
			
			
			System.out.println(minWays(w,L,n));
		}
	}
	public static int minWays(int w[],int l[],int n)
	{
		int count = 0;
		Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> jump = new HashMap<>();
		int arr[] = new int[n];
		for(int i=0;i<w.length;i++)
		{
			map.put(w[i],i);
			arr[i] = w[i];
			jump.put(w[i],l[i]);
		}
		Arrays.sort(arr);
		
		for(int i=1;i<n;i++)
		{
			int index = map.get(arr[i]);
			int previous = map.get(arr[i-1]);
			while(index <= previous)
			{
				index = index + jump.get(arr[i]);
				count++;
			}
			map.put(arr[i],index);
		}
		
	
		return count;
	}
}