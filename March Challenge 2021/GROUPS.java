import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  =Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String s = br.readLine().trim();
			int count = 0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i) == '1')
				{
					count++;
					while(i < s.length() && s.charAt(i) == '1')i++;
				}
			}
			
			System.out.println(count);
		
		
		}		
	}
}