import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		long mod = (1000000007);
		while(t-- > 0){
			int n = sc.nextInt() -1;
			long curr =1;
			// we have to find 2 power n-1
			long num = 2;
			
			while(n> 0)
			{
				
				if(n % 2 == 0)
				{
					num = ((num % mod )* (num % mod))%mod;
					n = n/2;
				}
				else
				{
					curr =  ((curr % mod) * (num % mod))%mod;
					n = n-1;
				}
			}
			System.out.println(curr);
		}
	}
}