import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test= Integer.parseInt(br.readLine().trim());
		while(test-- > 0)
		{
			String NK[] = br.readLine().split(" ");
			int n = Integer.parseInt(NK[0]);
			int k = Integer.parseInt(NK[1]);
			
			String s[] = br.readLine().split(" ");
			int sum =0;
			for(int i=0;i<s.length;i++)
			{
				int temp = Integer.parseInt(s[i]);
				if(temp>k)sum = sum + (temp - k);
			}
			System.out.println(sum);
		}
	}
	
}