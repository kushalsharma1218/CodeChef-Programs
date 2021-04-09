import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int j = 10;
		
		while(j>=2)
		{
			if(n % j == 0)break;
			else j--;
		}
		System.out.println(j);
	}
}