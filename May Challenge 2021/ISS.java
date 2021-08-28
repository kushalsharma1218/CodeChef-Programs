import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int k = sc.nextInt();
			int add =1;
			int prevSum  =k;
			int arr[] = new int[(2*k)+1];
			for(int i = 0;i<=2*k;i++)
			{
				prevSum += add;
				arr[i] =prevSum;
				add += 2;
				
			}
			int res = 0;
			for(int i = 0;i<2*k;i++){
				res = res + gcd(arr[i], arr[i+1]);
			}
			System.out.println(res);
		}
		
	}
	public static int gcd(int n1, int n2)
	{
		if(n1 == 0)return n2;
		
		else return gcd(n2%n1, n1);
	}
}