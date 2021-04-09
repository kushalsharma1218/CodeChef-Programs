import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine());
		 while(t-- > 0){
			 String nm[] = br.readLine().split(" ");
			 long n = Long.parseLong(nm[0]);
			 long k = Long.parseLong(nm[1]);
			 
			 
			 while(n % k != 0)
			 {
				 k--;
				 n--;
			 }
			 
			 System.out.println(Math.max(n/k,1)+" "+k);
			 
			 
		 }
		

	}
 }