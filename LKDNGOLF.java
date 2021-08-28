import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t  = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String str[] = br.readLine().split(" ");
			int n  = Integer.parseInt(str[0]);
			int x  = Integer.parseInt(str[1]);
			int k  = Integer.parseInt(str[2]);
			
			
			if(x % k ==0 || (n+1)%k == (x%k))
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