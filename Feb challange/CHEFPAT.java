import java.io.*;
import java.util.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- >0)
		{
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String sk[] = br.readLine().split(" "); 
			int newArr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(sk[i]);
				newArr[i] = Integer.parseInt(sk[i]);
			}
			
			Arrays.sort(arr,Collections.reverseOrder());
			Map<Integer,Set<Integer>> map = new HashMap<>();
			for(int i=0;i<arr.length;i++)
			{
				if(map.containsKey(arr[i]))
				{
					
				}
			}
			
			for(int i=0)
			
			
			
	
	}
}