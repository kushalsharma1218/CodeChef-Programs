import java.util.*;
public class A
{
	public static void main(String armm[])
	{
		Scanner sc= new Scanner(System.in);
		int tm = sc.nextInt();
		while(tm-- >0)
		{
			
			int n1 = sc.nextInt();
			n1 = n1 +1;
			
			
			
			System.out.println(findWays(n1));
			
		}
	}
	public static int findWays(int n1)
	{
		n1 = n1-1;
		 int[] h = new int[n1+1]; 
   
        h[0] = 1; 
        h[1] = 2; 
        h[2] = 4; 
	
   
        for (int b=3; b<=n1; b++) 
            h[b] =h[b-1] + h[b-2] + h[b-3]; 
   
        return h[n1]; 
		
	}
}