import java.io.*;
class A{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String nmk[] = br.readLine().split(" ");
			int n = Integer.parseInt(nmk[0]);
			int m = Integer.parseInt(nmk[1]);
			int k = Integer.parseInt(nmk[2]);
			
			int ans = 2;
			int high = n+m;
			for(int i= high;i>k;i++)
			{
				
			}
		}
	}
}