import java.io.*;
import java.util.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine().trim());
		
		for(int t=0;t<test;t++)
		{
			int n=Integer.parseInt(br.readLine().trim());
			int arr[]=new int[n];
			String Arr[]=br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				arr[i]=Integer.parseInt(Arr[i]);
			}
			int count=1;
			int min=0;
			int max=1;

			for(int i=1;i<n;i++)
			{
				if(arr[i]-arr[i-1]<=2){
					count++;
				}
				else
				{
					if(count>max)max=count;
					if(min==0)
					{
						min=max;
					}
					else{
						if(min>count)min=count;
					}
					count=1;
				}
			}
			if(count>max)max=count;
			if(min==0)min=max;
			else {
				if(min>count)min=count;
			}
			System.out.println(min+" "+max);
			
		
		}
		
	}
}