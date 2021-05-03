import java.io.*;
class A{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			long n = Long.parseLong(br.readLine());
			System.out.println(getMaxArea(n));
		}
	}
	public static long getMaxArea(long n)
	{

		if(n == 0)return 0;
		if(n == 1)return 20;
		if(n == 2)return 36;
		if(n == 3)return 51;
		if(n == 4)return 60;
		else
		{
			long rem = n%4;
			return (60 * (n/4)) - (4 *(n-4)) + (getMaxArea(rem));
			
			
		}
	}
}