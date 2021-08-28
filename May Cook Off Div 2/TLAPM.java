import java.util.*;
class A
{
	static long arr[][] = new long[2000][2000];
	public static void main(String ar[])
	{
		
		generate();
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0){
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
		
			System.out.println(findMax(x1-1,y1-1,x2-1,y2-1));
		}
	}
	public static long findMax(int x1,int y1,int x2,int y2)
	{

		
		long sum = 0;
		for(int i = x1;i<=x2;i++)
		{
			
			sum  += arr[i][y1];
		}
		
		for(int i = y1+1;i<= y2;i++)
		{
		
			sum += arr[x2][i];
		}
		
		

		return sum;
	
	}
	
	public static void generate()
	{
		arr[0][0] = 1;
		long num = 2;
		for(int j = 1;j<2000;j++)
		{
			int i= 0;
			int k = j;
			while(i<2000 && k>=0)
			{
				arr[i][k] = num++;
				i++;
				k--;
			}
		}
		 
		
			
	}
}