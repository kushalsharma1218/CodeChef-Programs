import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  =Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int N  =Integer.parseInt(br.readLine());
			String s[] = br.readLine().split(" ");
			
			int arr[] =  new int[N];
			
			for(int i=0;i<N;i++)arr[i] = Integer.parseInt(s[i]);
			
			Arrays.sort(arr);
			boolean flag = true;
			long val = 0;
			for(int i=0;i<N;i++)
			{
				if(arr[i] > (i+1))
				{
					flag = false;
					break;
				}
			  val = val+ (long)Math.abs(arr[i] - (i+1));
			}
			
			if(!flag)
			{
				System.out.println("Second");
			}
			else
			{
				if(val % 2 == 1)
				{
					System.out.println("First");
					
				}
				else
				{
					System.out.println("Second");
				}
			}
		
		}		
	}
}
