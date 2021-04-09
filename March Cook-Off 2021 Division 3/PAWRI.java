import java.io.*;
class A{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String s = br.readLine();
			char c[] = s.toCharArray();
			String pat = "party";
			if(s.length() < 5)System.out.println(s);
			else
			{
				for(int i =0;i<c.length;)
				{
					if(s.charAt(i) == pat.charAt(0))
					{
						int j = 0;
						while(j<pat.length() && (i+j) < s.length() && pat.charAt(j) == c[i+j])
						{
							j++;
						}
						
						if(j == pat.length())
						{
							c[(i+j) - 3] = 'w';
							c[(i+j) - 2] = 'r';
							c[(i+j) - 1] = 'i';
						}
						else
						{
							i+= j;
						}
					}
					else i++;
				}
				System.out.println(new String(c));
			}
		}
	}
}