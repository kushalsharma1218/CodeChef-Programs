import java.util.*;
class A{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			
			System.out.println(A/x + B/y);
		}
	}
}