import java.io.*;
class A{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
		    String arr[] = br.readLine().split(" ");
			long D = Long.parseLong(arr[0]);
			long d = Long.parseLong(arr[1]);
			long P = Long.parseLong(arr[2]);
			long Q = Long.parseLong(arr[3]);
			
			long count = 0;
			long y = 0;
			long x= 0;
			
			x = (long) ( D / d );
			
			if(x % 2 == 0){
				count =  count + (long)(d * ((x/2) * (2* P + (x -1) * Q)));
			}
			else
			{
				count =count + (long) (d * (x*(P +((x - 1) / 2) * Q)));
			}
			
			count = count + (long) ( (D % d) * (P + (x) * Q) );
			System.out.println(count);
		}
	}
}