import java.io.*;

class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			String s[] = br.readLine().split(" ");
			int h = Integer.parseInt(s[0]);
			int p = Integer.parseInt(s[1]);
			
			while(h!=0 && p!=0)
			{
				if(h - p<=0)
				{
					h = 0;
				}
				else
				{
					h = h-p;
				}
				p = p/2;
			}
			if(h == 0)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
	}
}