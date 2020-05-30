import java.io.*;
import java.util.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine().trim());
		
		for(int t=0;t<test;t++)
		{
			int arr[] =new int[6];
			String WP[] = br.readLine().split(" ");
			for(int i=0;i<6;i++)
			{
				arr[i]=Integer.parseInt(WP[i]);
			}
			
			int sum=0;
			for(int i=0;i<5;i++)
			{
				sum=sum+arr[5]*arr[i];
			}
			if(sum<=120)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
				
			}
		}
	}
}