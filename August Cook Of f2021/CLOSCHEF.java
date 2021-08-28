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
			
			long arr[] = new long[n];
			for(int i = 0;i<n;i++)
			{
				arr[i] = sc.nextLong();
			}
			
			Arrays.sort(arr);
			
			System.out.println(findAns(arr));
			
		}
	}
	public static boolean check(long arr[], int n,  long val)
	{
		for(int i = 0;i<n;i++)
		{
			if(arr[i] == val)return true;
		}
		
		return false;
	}
	public static int findAns(long arr[])
	{
		int n = arr.length;
		if(n == 1)
		{
			return 1;
		}
		
		if(!check(arr, n, arr[0] * arr[1]))
		{
			return 0;
		}
		
		if(!check(arr, n, arr[n-1] * arr[n-2]))
		{
			return 0;
		}
		
		if(!check(arr, n, arr[0] * arr[n -1]))
		{
			return 0;
		}
		
		return 1;
	}
}