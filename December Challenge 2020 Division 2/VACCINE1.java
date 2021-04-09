import java.io.*;

class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in[] = br.readLine().split(" ");
		
		int d1 = Integer.parseInt(in[0]);
		int v1 = Integer.parseInt(in[1]);
		int d2 = Integer.parseInt(in[2]);
		int v2 = Integer.parseInt(in[3]);
		int p = Integer.parseInt(in[4]);
		
		
		int i =1;
		int pro = 0;
		do
		{
			if(i>= d1)pro = pro + v1;
			if(i >= d2) pro = pro + v2;
			
			if(pro >= p)break;
			i++;
		}
		while(pro < p);
		
		System.out.println(i);
		
	}
}