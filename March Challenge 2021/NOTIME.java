import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String NHX[] = br.readLine().split(" ");
		int N =Integer.parseInt(NHX[0]);
		int H =Integer.parseInt(NHX[1]);
		int x =Integer.parseInt(NHX[2]);
		
		int arr[] = new int[N];
		
		String str[] = br.readLine().split(" ");
		
		int max = 0;
		for(int i = 0;i<N;i++){
			arr[i] = Integer.parseInt(str[i]);
			max = Math.max(arr[i],max);
		}
		
		if(H <= x)System.out.println("YES");
		else
		{
			H = H - max;
			if(H <= x)System.out.println("YES");
			else
			{
				System.out.println("NO");
			}
		}
			
		
	}
}