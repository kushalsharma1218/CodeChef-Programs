import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String nk[] = br.readLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			
			String str[] = br.readLine().split(" ");
			int arr[] =new int[str.length];
			for(int i= 0;i<n;i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			int max = 0;
			int sum = 0;
			for(int i =0;i<k;i++)
			{
				sum += arr[i];
			}
			max = sum;
			for(int i=k;i<n+k -1;i++)
			{
				sum -= arr[i-k];
				
				int num = i %n;
				sum += arr[num];
				
				max = Math.max(sum,max);
			}
			
			
			System.out.println(max);
		}
			
		
	}
}