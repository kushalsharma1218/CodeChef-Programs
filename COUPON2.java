import java.io.*;

class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String str[] = br.readLine().split(" ");
			int d = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);
			
			int sum1 = 0;
			int sum2 = 0;
			int tSum = 0;
			String str1[] = br.readLine().split(" ");
			String str2[] = br.readLine().split(" ");
				
			for(int i=0;i<str1.length;i++)
			{
				sum1 += Integer.parseInt(str1[i]);
				sum2 += Integer.parseInt(str2[i]);
			}
			
			int num1 = sum1 + sum2 +d+d;
			int num2 = sum1 +sum2 +c;
			if(sum1 < 150)
			{
			
				num2 += d;
			}
			if(sum2 < 150)
			{
				num2 += d;
			}
			if(num1 > num2)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			
			
			
			
		}
		
	}
}