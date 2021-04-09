import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String s = br.readLine().trim();
			
			boolean flag = false;
			
			for(int i =0;i<s.length();i++)
			{
				if(s.charAt(i) == '1')
				{
					if(flag == true)
					{
						flag  =false;
						break;
					}
					else
					{
						int j =i;
						while(j<s.length() && s.charAt(j) == '1')
						{
							j++;
						}
						flag = true;
						i = j;
					}
				}
			}
			
			if(flag == false)System.out.println("NO");
			else System.out.println("YES");
		}
	}
}