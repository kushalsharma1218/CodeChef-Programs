import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String str[] = br.readLine().split(" ");
			for(int i = 0;i<n;i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			
			
			Map<Integer,Integer> map = new HashMap<>();
			
			for(int i = 0;i<n;i++)
			{
				int sum = 0;
				for(int j = i;j<n;j++){
					sum+= arr[j];
					map.put(sum, map.getOrDefault(sum,0)+1);
				}
			}
			
			int ans= 0;
			for(Map.Entry<Integer,Integer> e: map.entrySet())
			{
				int key = (Integer)e.getKey();
				int mul = (Integer)e.getValue();
				ans = Math.max(key * mul, ans);
			}
			
			
			System.out.println(ans);
		}
	}
}