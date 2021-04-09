import java.io.*;
class A{
	static int arr[] = new int[2000];
	public static void generateOdd()
	{
		int index = 0;
		for(int i =1;i*i<=1000000;i++)
		{
			arr[index++] = i*i;
		}
	}
	
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		generateOdd();
		// for(int i = 0;i<arr.length;i++)
		// {
			// System.out.print(arr[i]+" ");
		// }
		while(t-- > 0)
		{
			int index = 0;
			do{
				System.out.println(arr[index++]);
				int n = Integer.parseInt(br.readLine().trim());
				if(n == 1)break;
				if(n == -1)System.exit(1);
				
			}while(index< 2000);
		}
	}
}