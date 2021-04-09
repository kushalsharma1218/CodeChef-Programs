import java.io.*;
class A
{
	public static void main(String ar[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String nk[] = br.readLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			String str[] = br.readLine().split(" ");
			int arr[]= new int[n];
			for(int i=0;i<n;i++)arr[i] = Integer.parseInt(str[i]);
				
			int positive = 0;
			boolean slow = false;
			boolean bot = true;
			
			for(int i=0;i<n;i++)
			{
				if(arr[i]>=0)positive++;
				if(arr[i] > k)slow = true;
				if(arr[i] > 1)bot = false;
				if(arr[i] == -1)bot = false;
			}
			int ceil = 0;
			if(n%2 == 0)
			{
				ceil = n/2;
			}
			else ceil = n/2 +1;
			
			if(positive < ceil)
			{
				System.out.println("Rejected");
			}
			else if(slow)
			{
				System.out.println("Too Slow");
			}
			else if(bot)
			{
				System.out.println("Bot");			
			}
			else
			{
				System.out.println("Accepted");							
			}
		
		}
	}
	
}