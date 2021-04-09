import java.io.*;
class A{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String str[] = br.readLine().split(" ");
			int w1 = Integer.parseInt(str[0]);
			int w2 = Integer.parseInt(str[1]);
			int x1 = Integer.parseInt(str[2]);
			int x2 = Integer.parseInt(str[3]);
			int m = Integer.parseInt(str[4]);
			
			int lowLimit = x1 * m;
			int highLimit = x2 * m;
			
			int total = w2 - w1;
			if(total >= lowLimit && total <= highLimit)
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