import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			// 7
			int ans1 = 7	 *x;
			int ans2 = (d*y) + ((7-d)*z);
			
			System.out.println(Math.max(ans1, ans2));
			
		}
	}
}