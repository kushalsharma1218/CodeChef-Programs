import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			String s = sc.next();
			int oneCount = 0;
			int zeroCount = 0;
			for(int i = 0;i<n;i++){
				if(s.charAt(i) == '1')oneCount++;
				if(s.charAt(i) == '0')zeroCount++;
				
				if(oneCount >= zeroCount)break;
					
			}
			
			
			if(oneCount >= zeroCount)System.out.println("YES");
			else System.out.println("NO");
			
			
		}
	}
}