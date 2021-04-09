import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String roc[] = br.readLine().split(" ");
		 int r = Integer.parseInt(roc[0]);
		 int o = Integer.parseInt(roc[1]);
		 int c = Integer.parseInt(roc[2]);

		
		if(c + ((20 - o) * 6 *6) > r)System.out.println("YES");
		else System.out.println("NO");

	}
 }