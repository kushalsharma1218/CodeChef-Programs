import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{	
			int n = Integer.parseInt(br.readLine());
			int winA =0;
			int winB =0;
			
			while(n-->0)
			{
				String s[] = br.readLine().split(" ");
				int a = digitsSum(Integer.valueOf(s[0]));
				int b = digitsSum(Integer.valueOf(s[1]));
				
				if(a>b)winA++;
				else if(b>a)winB++;
				else {winA++; winB++;}
			}
			if(winA>winB)
			{
				System.out.println("0 " + winA);
			}
			else if(winB > winA)
			{
				
				System.out.println("1 " + winB);
			}
			else
			{
				
				System.out.println("2 " + winB);
			}
			
		}
	}
	public static int digitsSum(long n)
	{
		if(n<10)return (int)n;
			
		return (int)(digitsSum(n/10) + n%10);
	}
}