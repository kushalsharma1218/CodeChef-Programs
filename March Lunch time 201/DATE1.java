import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));
		int  t= Integer.parseInt(br.readLine());
		while(t-- > 0){
			String ayx[] = br.readLine().split(" ");
			long a = Long.parseLong(ayx[0]);
			long y = Long.parseLong(ayx[1]);
			long x = Long.parseLong(ayx[2]);
			
			if(a >= y){
				System.out.println(x * y);
				
			}
			else
			{
				System.out.println(x*a +1);
			}
			
		}
	}
}