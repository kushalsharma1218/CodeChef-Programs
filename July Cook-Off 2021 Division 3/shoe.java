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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			int left = 0;
			int right = 0;
			
			if(a == 0)left++;
			else right++;
			
			if(b== 0)left++;
			else right++;
			
			if(c == 0)left++;
			else right++;
			
			if(left >= 1 && right >= 1)
				System.out.println("1");
			else System.out.println("0");
		}
	}
}