class A
{
	public static void main(String ar[])
	{
		int arr[][] = {
			{1,2,3,4},
				{1,2,3,4},
					{1,2,3,4}
		};
		
		
		generatePrefix(arr);
		
		int l1 = 1;
		int l2 = 2;
		int r1 = 1;
		int r2 = 3;
		
		
		int sum = arr[l2][r2];
		if(l1 >0)sum -= arr[l1-1][r2];
		if(r1>0)sum -= arr[l2][r1-1];
		if(r1>0 && l1>0)sum += arr[l1-1][r1-1];
		
		System.out.println(sum);
	}
	public static void generatePrefix(int arr[][])
	{
		for(int i =0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				int p_sum = arr[i][j];
				if(i>0)p_sum += arr[i-1][j];
				if(j>0)p_sum += arr[i][j-1];
				if(i>0 && j>0)p_sum -= arr[i-1][j-1];
			
					arr[i][j] = p_sum;
			}
		}
	}
}