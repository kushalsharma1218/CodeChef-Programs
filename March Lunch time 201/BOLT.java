import java.util.*;
import java.io.*;
class A{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String str[] = br.readLine().split(" ");
			double k1 = Double.parseDouble(str[0]);
			double k2 = Double.parseDouble(str[1]);
			double k3 = Double.parseDouble(str[2]);
			double v = Double.parseDouble(str[3]);
			
			double ans = 100.0 /  (k1 * k2 * k3 * v);	
			double ans2 = (double)Math.round(ans * 100) / 100;
			
			
			if(ans2 < 9.58)
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