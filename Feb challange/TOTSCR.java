import java.io.*;
import java.util.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- >0)
		{
			String nk[]= br.readLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			int arr[] = new int[k];
			String sk[] = br.readLine().split(" "); 
			for(int i=0;i<k;i++)
			{
				arr[i] = Integer.parseInt(sk[i]);
			}
			
			while(n-- > 0)
			{
				int sum = 0;
				String s = br.readLine();
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i) == '1')sum += arr[i];
				}
				System.out.println(sum);
			}
			
		}
			
	
	}
}