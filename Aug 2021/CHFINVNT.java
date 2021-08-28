import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			long n = sc.nextLong();
			long p = sc.nextLong();
			long k = sc.nextLong();
			
			long x = p%k;
			long y = (n-1)%k;
			
			long ans = 0;
			if(x > y){
				ans = (((n-1)/k)*x) + y + 1;
			}
			else{
				ans = ((n-1)/k + 1)*x;
			}
			
			for(long i =x;i<=n-1;i+=k)
			{
				ans = ans + 1;
				if(i == p)
				{
					break;
				}
			}
			
			System.out.println(ans);
		}
	}
}