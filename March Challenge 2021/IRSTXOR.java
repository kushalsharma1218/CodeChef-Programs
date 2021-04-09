import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  =Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			
			int num = (int)(Math.log(n) / Math.log(2));
			System.out.println(num);
			long pow =(int) Math.pow(2,num+1);
			long lpow =(int) Math.pow(2,num);
			long num1 = lpow -1;
			long num2 = Math.abs(pow - n + num1);
			
			System.out.println(num1 * num2);
		
		}		
	}

} 