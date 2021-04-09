import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0)
		{
			String pstr = (br.readLine());
			int n = Integer.parseInt(br.readLine());
			String time[][] = new String[n][2];
			for(int i=0;i<n;i++)
			{
				String str = br.readLine();
				time[i][0] =str.substring(0,8);
				time[i][1] = str.substring(9,str.length());
				// System.out.println(time[i][0]+" ..../// "+time[i][1]);
			}
			int p = convertTimeInto24(pstr);
			int interval[][] = new int[n][2];
			for(int i=0;i<n;i++)
			{
				// System.out.println(time[i][0]);
				interval[i][0] = convertTimeInto24(time[i][0]);
				
				interval[i][1] = convertTimeInto24(time[i][1]);
			}
			int count = 0;
			for(int i=0;i<n;i++)
			{
				if(p>= interval[i][0] && p <= interval[i][1])
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
					
				}
			}
			System.out.println();
			
		}
	}
	public static int convertTimeInto24(String pstr)
	{
		// System.out.println(pstr);
		StringBuilder sb = new StringBuilder(pstr);
		if(pstr.charAt(pstr.length() - 2) == 'A')
		{
			if(pstr.charAt(0) == '1' && pstr.charAt(1) == '2')
			{
				return Integer.parseInt(pstr.substring(3,5));
			}
			else
			{
				String s = sb.substring(0,2) + sb.substring(3,5);
				return Integer.parseInt(s);
			}
			
		}
		else
		{
			int sum = 1200;
			if(pstr.charAt(0) == '1' && pstr.charAt(1) == '2')
			{
				return Integer.parseInt(pstr.substring(3,5)) + sum;
			}
			else
			{
				String s = sb.substring(0,2) + sb.substring(3,5);
				return Integer.parseInt(s) + 1200;

			}
		}
		
	}
}