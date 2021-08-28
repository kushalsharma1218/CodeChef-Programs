import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-- > 0)
		{
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println((((100 - x) * b) + a )* 10);
		}
	}
}