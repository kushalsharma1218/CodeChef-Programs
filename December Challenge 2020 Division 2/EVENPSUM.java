import java.io.*;

class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- >0)
		{
			String in[] = br.readLine().split(" ");
			long A = Integer.valueOf(in[0]);
			long B = Integer.valueOf(in[1]);
			
			long evenA = (long)(A /2);
			long oddA = A - evenA;
			
			long evenB = (long)(B /2);
			long oddB = B - evenB;
			
			
			
			System.out.println(evenA * evenB + oddA * oddB);
		}	
	}
}