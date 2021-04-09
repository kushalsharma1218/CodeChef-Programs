import java.io.*;
class A
{
	public static void main(String ar[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			
			int n = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int arr[]= new int[n];
			for(int i=0;i<n;i++)arr[i] = Integer.parseInt(str[i]);
			
			int evenNum =0;
			int oddNum = 0;
			
			for(int i=0;i<n;i++)
			{
				if(arr[i]!= 0 && arr[i] % 2 ==0)evenNum++;
				if(arr[i]!= 0 && arr[i] % 2 !=0)oddNum++;
			}
			
			if(evenNum > oddNum)
			{
				System.out.println(oddNum);
			}
			else{
				System.out.println(evenNum);
				
			}
		
		}
	}
	
}