class A
{
	public static void main(String ar[])
	{
		int arr[] = {200,500,1000,2000,20,30,100};
		int n = arr.length;
		int x = 100;
		System.out.println(search(arr,x,n));
	}
	public static int search(int arr[],int x,int n)
	{
		int low = 0;
		int high = n-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == x)return mid;
			if(arr[mid]>arr[low])
			{
				if(x>=arr[low] && arr[mid]>x)
				{
					high = mid-1;
				}
				else
				{
					low = mid +1;
				}
			}
			else 
			{
				if(x>arr[mid] && x<=arr[high]){
					
				low = mid+1;
				}
				else
				{
					high = mid-1;
				}
			}
		}
		return -1;
	}
}