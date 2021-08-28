import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int arr[] = new int[n];
			for(int i = 0;i<n;i++)arr[i] = sc.nextInt();
			
			
			// we just need to compare kth value with ith value
			int ans = 0;
			for(int i = 0;i<k;i++)
			{
				Map<Integer,Integer> map = new HashMap<>();
				int count = 0;
				for(int j = i;j<n;j+=k)
				{
					map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
					count = Math.max(map.get(arr[j]), count);
				}
				
				ans +=  count;
			}
			
			System.out.println(n-  ans);
			
		}
	}
}