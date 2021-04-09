import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));
		int  t= Integer.parseInt(br.readLine());
		while(t-- > 0){
			String nx[] = br.readLine().split(" ");
			int n = Integer.parseInt(nx[0]);
			long x = Long.parseLong(nx[1]);
			
			long arr[][] = new long[n][2];
			long max = 0;
			for(int i = 0;i<n;i++)
			{
				String str[]= br.readLine().split(" ");
				arr[i][0] = Long.parseLong(str[0]);
				arr[i][1] = Long.parseLong(str[1]);
				
				
				if(arr[i][0] <=x)
				{
					max = Math.max(arr[i][1],max);
				}
				
			}
			System.out.println(max);
			
			
			
		}
	}
}