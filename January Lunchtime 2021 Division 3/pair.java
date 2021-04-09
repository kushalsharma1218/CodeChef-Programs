import java.io.*;
class A
{
	public static void main(String ar[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String str[] = br.readLine().split(" ");
			int arr[]= new int[3];
			arr[0] = Integer.parseInt(str[0]);
			arr[1] = Integer.parseInt(str[1]);
			arr[2] = Integer.parseInt(str[2]);
			
			if(arr[0] == arr[1]+arr[2])
			{
				System.out.println("YES");
			}
			else if(arr[1] == arr[0]+arr[2])
			{
				System.out.println("YES");
			}
			else if(arr[2] == arr[0]+arr[1])
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