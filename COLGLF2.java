import java.io.*;

class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int s = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int Q[]= new int[str.length];
			for(int i=0;i<str.length;i++)
			{
				Q[i] = Integer.parseInt(str[i]);
			}
			System.out.println(Q[0]+" Q");
			int sum = 0;
			for(int i=0;i<str.length;i++)
			{
				String s1[] = br.readLine().split(" ");
				int k = Integer.parseInt(s1[0]);
				System.out.println(k+" k");
				int arr[] = new int[k];
				sum = sum + Integer.parseInt(s1[1]);
				System.out.println(sum+" sum "+Q[i]);
				for(int j = 1;j<k;j++)
				{
					int num = Integer.parseInt(s1[j]) - Q[i];
					sum += num;
					System.out.println(sum+" sum "+Q[i]);
				}
			}
			System.out.println(sum);
		}
		
	}
}	