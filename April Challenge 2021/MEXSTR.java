import java.io.*;
class A
{
	static int arr[] = new int[(int)1e6];
	static int arr1[] = new int[(int)1e6];
	static int dp1[] = new int[(int)1e6+2];
	static int dp2[] = new int[(int)1e6+2];
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String s = br.readLine();
			int n = s.length();
			int pos =-1;
			for(int i = 0;i<n;i++)
			{
				if(s.charAt(i) == '0')
				{
					for(int j = pos+1;j<=i;j++)
					{
						arr[j] = i;
					}
					pos = i;
					
				}
			}
			for(int i = pos+1;i<n;i++)
			{
				arr[i] = n;
			}
			
			if(arr[0] == n)
			{
				System.out.println("0");
			}
			else{
			
			pos = -1;
			for(int i=0;i<n;i++)
			{
				if(s.charAt(i) =='1')
				{
					for(int j= pos+1;j<=i;j++)
					{
						arr1[j] = i;
					}
					pos = i;
				}
			}
			for(int i = pos+1;i<n;i++)
			{
				arr1[i] = n;
			}
			
			dp1[n] = dp1[n+1] = 0;
			dp2[n] = dp2[n+1] = 0;
			for(int i=n-1;i>=0;i--)
			{
				dp1[i] = dp1[i+1];
				if(s.charAt(i) == '0' && arr1[i] < n)
				dp1[i] = Math.max(dp1[i],dp1[arr1[i]+1]+1);
				if(s.charAt(i) == '1' && arr[i] < n)
				{
					dp1[i] = Math.max(dp1[i],dp1[arr[i]+1]+1);
				}
				dp2[i] = dp2[i+1];
				if(arr1[i] <n)dp2[i] = Math.max(dp2[i],dp1[arr1[i]+1]+1);
			}
			
			int len = dp2[0] +1;
			int currInd = arr1[0]+1;
			StringBuffer ans =new StringBuffer("1");
			for(int i = 1;i<len;i++)
			{
				if(currInd >= n){
					ans.append("0");
					continue;
				}
				
				if(arr[currInd] >= n)
				{
					ans.append("0");
					currInd =arr[currInd] +1;
					continue;
				}
				if(dp1[arr[currInd]+1] < len - i -1)
				{
					ans.append("0");
					currInd = arr[currInd]+1;
				}
				else
				{
					ans.append("1");
					currInd = arr1[currInd]+1;
				}
			}
			
			System.out.println(ans);
		}
		}
	}
}
