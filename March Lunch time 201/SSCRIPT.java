import java.util.*;
import java.io.*;
class A{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String nk[] = br.readLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			String s = br.readLine();
			
			int curr = 0;
			boolean flag = false;
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i) == '*')
				{
					curr++;
				}
				else
				{
					curr = 0;
				}
				if(curr >= k)
				{
					flag = true;
					break;
				}
			}
			
			if(flag)
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