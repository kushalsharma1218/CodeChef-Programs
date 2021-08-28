import java.io.*;
import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			long x = sc.nextLong();
			long y = sc.nextLong();
			
			if(x > y)
			{
				long temp = x;
				x = y;
				y = x;
			}
			
			if(gcd(x, y) > 1){
				System.out.println(0);
			}
			else{
				if((x & 1) == 1)
				{
					x++;
					if(gcd(x, y) >  1)
					{
						System.out.println(1);
					}
					x--;
					y++;
					if(gcd(x, y) > 1){
						System.out.println(1);
					}
					else System.out.println(2);
					}
					else{
						System.out.println(1);
					}
			
			}
		}
	}
	static long gcd(long a, long b)
    {
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}