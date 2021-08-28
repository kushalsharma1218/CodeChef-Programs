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
			int g1 = sc.nextInt();
			int s1 = sc.nextInt();
			int b1 = sc.nextInt();
			int g2 = sc.nextInt();
			int s2 = sc.nextInt();
			int b2 = sc.nextInt();
			
			System.out.println((g1 + s1 + b1) > (g2 + b2 + s2)? 1 : 2);
		}
	}
}