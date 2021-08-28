import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int g = sc.nextInt();
			int c = sc.nextInt();
			
			int h = c*c;
			h = h/(2*g);
			
			System.out.println(h);
			
		}
	}
}