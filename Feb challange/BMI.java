import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
			int M = sc.nextInt();
			int H = sc.nextInt();
			
			int bmi = M /(H * H);
			
			
			if(bmi <= 18 )
			{
				System.out.println("1");
			}
			else if(bmi >=19 && bmi <=24 )
			{
				System.out.println("2");
			}
			else if(bmi >= 25 && bmi <=29 )
			{
				System.out.println("3");
			}
			else if(bmi >= 30)
			{
				System.out.println("4");
			}
			
		}
	}
}