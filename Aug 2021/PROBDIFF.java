import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int arr[] = new int[4];
			
			for(int i = 0;i<4;i++)
			{
				arr[i] = sc.nextInt();
			}
			
			Map<Integer, Integer> map = new HashMap<>();
			for(int i = 0;i<arr.length;i++){
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			}
			
			if(map.size() == 4 || map.size() == 3)System.out.println(2);
			else if(map.size() == 1)System.out.println(0);
			else{
				if(map.get(arr[0]) % 2 == 0)
				{
					System.out.println(2);
				}
				else System.out.println(1);
			}
			
		}
	}
}