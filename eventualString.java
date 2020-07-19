import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		while(test-->0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			String s = br.readLine();
			System.out.println(reduce(s,n));
		}
	}
	public static String reduce(String s, int n)
	{
		int arr[] = new int[27];
		for(int i =0;i<n;i++)
		{
			arr[s.charAt(i) - 'a']++;
		}
		for(int i=0;i<=26;i++)
		{
			if(arr[i]%2!=0)return "NO";
		}
		return "YES";
	}
}