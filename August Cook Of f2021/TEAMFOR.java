import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0)
		{
			int n = sc.nextInt();
			String s = sc.next();
			String t = sc.next();
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d= 0;
			
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i) == '1' && t.charAt(i) == '1')c++;
				else if(s.charAt(i) == '1')
				{
					a++;
				}
				else if(t.charAt(i) == '1')
				{
					b++;
				}
				else d++;
			}
			
			int ans = 0;
			
			int num = Math.min(a,b);
			ans += num;
			if(a > num)
			{
				a -= num;
				b = 0;
			}
			else{
				a = 0;
				b -= num;
			}
			
			int totalExtra = a + b + d;
			
			num =  Math.min(totalExtra, c);
			ans += num;
			if(c > num)
			{
				c-= num;
				ans += c/2;
			}
			
			
			System.out.println(ans);
		}
	}
}