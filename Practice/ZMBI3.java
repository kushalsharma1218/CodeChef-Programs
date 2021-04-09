import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String nkd[] = br.readLine().split(" ");
			int n = Integer.parseInt(nkd[0]);
			int k = Integer.parseInt(nkd[1]);
			int d = Integer.parseInt(nkd[2]);
			
			String str[] = br.readLine().split(" ");
			int arr[] =new int[str.length];
			for(int i= 0;i<n;i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			int max = 0;
			int curr = 0;
			int lessThanD = 0;
			int index = 0;
			for(int i =0;i<n;i++)
			{
				if(arr[i] <=d)lessThanD++;
				
				if(lessThanD <= k)
				{
					curr++;
					max = Math.max(curr,max);
				}
				else
				{
					max = Math.max(curr,max);
					while(lessThanD > k && index < i)
					{
						index++;
						if(arr[index] <= d)lessThanD--;
					}
				}
			}
			
			System.out.println(max);
		}
			
		
	}
}