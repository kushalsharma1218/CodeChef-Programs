import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- >0)
		{
			String NKD[] = br.readLine().split(" ");
			
			int N = Integer.parseInt(NKD[0]);
			int K = Integer.parseInt(NKD[1]);
			int D = Integer.parseInt(NKD[2]);
			
			
			String str[] = br.readLine().split(" ");
			int arr[] = new int[N];
			int sum = 0;
			for(int i = 0;i<N;i++)
			{
				arr[i] = Integer.parseInt(str[i]);
				sum = sum + arr[i];
			}
			
			if(sum / K > D)System.out.println(D);
			else System.out.println(sum / K);
		}
	}
}