import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String nk[] = br.readLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int x = Integer.parseInt(nk[1]);
			
			Map<Long,Integer> map = new HashMap<>();
			long arr[] = new long[n];
			String str[] = br.readLine().split(" ");
			for(int i = 0;i<n;i++)
			{
				arr[i] = Long.parseLong(str[i]);
				map.put(arr[i],map.getOrDefault(arr[i],0)+1);
			}
			if(x == 0)System.out.println(n);
			else {
			int max = 0;
			for(int i= 0;i<n;i++)
			{
				if(map.get(arr[i]) > 1)
				{
					if(map.get(arr[i]) > x)
					{
						x = 0;
						max = map.size();
						break;
					}
					else if(map.get(arr[i]) > 1)
					{
						int num = map.get(arr[i]);
						x = x - num+1;
						map.put(arr[i],1);
					}
				}
			}
			if(x != 0)
			{
				// if we need two or more choclates to satisfy brother
				boolean canEat = true;
				for(int i = 0;i<n;i++)
				{
					if(x == 0)
					{
						System.out.println(map.size());
						canEat = false;
						break;
					}
					if(map.containsKey(arr[i]))
					{
						map.remove(arr[i]);
						x--;
					}
				}
				if(canEat)System.out.println(0);
			}
			else System.out.println(max);
			}	
		}
	}
}