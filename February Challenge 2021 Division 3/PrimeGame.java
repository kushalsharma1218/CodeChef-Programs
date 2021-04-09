import java.util.*;
import java.io.*;
class A
{
	{
		magic();
	}
	static boolean prime[] = new boolean [1000001];
	static int count[] = new int[1000001];
	public static void magic()
	{
		for(int p =2; p*p <= 1000000; p++)
		{
			if(prime[p] == false)
			{
				for(int i= p * p; i<= 1000000; i += p)
					prime[i] = true;
			}
		}
		int count1 = 0;
		for(int i = 2;i<= 1000000;i++)
		{
			if(!prime[i])
				count1++;
			count[i] = count1;
		}
	}
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0)
		{
			String arr[] = br.readLine().split(" ");
			int x = Integer.parseInt(arr[0]);
			int y = Integer.parseInt(arr[1]);
			if(x<=y)System.out.println("Chef");
			else
			{
				boolean chef = true;
				int count = 0;
				while(x>=2)
				{
					System.out.println(count[x]);
					if(x%2 != 0 && x %3 != 0 && prime[x])
					{
						count1++;
						if(count1>y)
						{
							chef = false;
							break;
						}
					}
					if(x == 2 || x == 3)count1++;
					if(count1>y)
					{
						chef = false;
						break;
					}
					x--;
				}
				
				// if(chef)
				// {
					// System.out.println("Chef");
				// }
				// else
				// {
					// System.out.println("Divyam");
				// }
		}
		}
	}
}