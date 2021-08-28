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
			String arr[] = new String[n];
			
			for(int i =0;i<n;i++)
			{
				arr[i] = sc.next();
			}
			
			String ans = "";
			
			for(int i = 0;i<n;i++)
			{
				List<Integer> zero = new ArrayList<>();
				List<Integer> one = new ArrayList<>();
				for(int j = 0;j<n;j++)
				{
					if(arr[i] == null)continue;
					if(arr[i].charAt(j) == '1')
					{
						one.add(i);
					}
					else zero.add(i);
				}
				
				if(zero.size() >= one.size())
				{
					ans += "1";
					for(Integer it : zero)
					{
						arr[it] = null;
					}
				}
				else{
					ans += "0";
					for(Integer it : one)
					{
						arr[it] = null;
					}
				}
				
			}
			
			for(int i = 0;i<n;i++)
			{
				if(arr[i] != null)
				{
					ans += "0";
					break;
				}
			}
			
			while(ans.length() < n)
			{
				ans += "0";
			}
			
			System.out.println(ans);
			
		}
	}
}