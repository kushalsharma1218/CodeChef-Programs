import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test= Integer.parseInt(br.readLine().trim());
		while(test-- > 0)
		{
			String s = br.readLine();
			int count=0;
			int sum =0;
			for(int i=0;i<s.length();)
			{
				if(s.charAt(i)=='x')
				{
					i++;
					if(i<s.length())
					{
						if(s.charAt(i)=='y')
						{
							i++;
							
							sum=sum+1;
						}
					}
				}
				else if(s.charAt(i)=='y')
				{
					i++;
					if(i<s.length())
					{
						if(s.charAt(i)=='x')
						{
							i++;
							sum=sum+1;
						}
					}
				}
				else {
					System.out.println("sign");
					i++;
				}
				
			}
			System.out.println(sum);
		}
	}
}