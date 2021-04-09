import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String nba[] = br.readLine().split(" ");
			int n = Integer.parseInt(nba[0]);
			int b = Integer.parseInt(nba[1]);
			int a = Integer.parseInt(nba[2]);
			
			String str[] = br.readLine().split(" ");
			double arr[] =new double[str.length];
			for(int i= 0;i<n;i++)
			{
				arr[i] = Long.parseLong(str[i]);
			}
			double avg= 0.0;
			
			for(int i = a;i<= b;i++)
			{
				double windowSize = 0.0;
				for(int j=0;j<i;j++)
				{
					windowSize += arr[j];
				}
				avg = Math.max(avg,windowSize/i);
				
				for(int j = i;j<n;j++)
				{
					windowSize -= arr[j-i];
					windowSize += arr[j];
					avg = Math.max(avg, windowSize /i);
				}
			}
			System.out.println(avg);
			
			
		}
			
		
	}
}