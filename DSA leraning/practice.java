import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		while(test-->0)
		{
			int n = Integer.parseInt(br.readLine().trim());
		int arr[] = new int[n];
			String s[] = br.readLine().split(" ");
			for(int i=0;i<s.length;i++)
			{
				arr[i] = Integer.parseInt(s[i]);
			}
			int min = arr[0];
			int count =1;
			for(int i=1;i<arr.length;i++)
			{
				if(min>arr[i])
				{
					count++;
					min = arr[i];
				}
			}
			System.out.println(count);
		}
	}
}