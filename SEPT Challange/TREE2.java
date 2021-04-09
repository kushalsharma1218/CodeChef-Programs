import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String s[]= br.readLine().split(" ");
			for(int i =0;i<s.length;i++)
			{
				arr[i] = Integer.valueOf(s[i]);
			}
			Set<Integer> set = new HashSet<>();
			for(int i=0;i<n;i++)
			{
				if(!set.contains(arr[i]))
				{
					set.add(arr[i]);
				}
			}
			if(set.contains(0))
			{
				System.out.println(set.size()-1);
			}
			else
			System.out.println(set.size());
		}
	}
}