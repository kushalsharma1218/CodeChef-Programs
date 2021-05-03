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
			long a = sc.nextLong();
			long b = sc.nextLong();
			long anu = 0;
			long sar = 0;
			while(n-- > 0)
			{
				String s = sc.next();
				if(s.charAt(0) == 'E' || s.charAt(0) == 'Q' || s.charAt(0) == 'U' || s.charAt(0) == 'I' || s.charAt(0) == 'N' || s.charAt(0) == 'O' || s.charAt(0) == 'X')
				{
					sar += a;
				}
				else anu += b;
			}
			
			if(anu > sar)
			{
				System.out.println("ANURADHA");
			}
			else if(sar > anu)
			{
				System.out.println("SARTHAK");
			}
			else System.out.println("DRAW");
			
		}
	}
}