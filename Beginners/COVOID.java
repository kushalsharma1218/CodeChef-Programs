import  java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-- > 0)
		{
		int n=Integer.parseInt(br.readLine().trim());
		String peo[]=br.readLine().split(" ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(peo[i]);
		}
		int count=1;
		int max=1;
		int min=0;
		boolean b= false;
		for(int i=0;i<n-1;i++)
		{
			if(Math.abs(arr[i]-arr[i+1])<=2)
			{
				count++;
			}
			else
			{
				max=Math.max(count,max);
				if(min==0)
				{
					min=count;
				}
				else
				{
					min=Math.min(count,min);
				}
				count=1;
			}
		}
		max=Math.max(count,max);
		if(min==0 ){
			min=count;
		}
		else
		min=Math.min(count,min);
			System.out.println(min+" "+max);
		
		}
	}
}