import java.util.*;
import java.io.*;
class A{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		HashSet<Integer> set = new HashSet<>();
		boolean flag = false;
		for(int i =0;i<str.length;i++)
		{
			if(set.contains(Integer.parseInt(str[i])))
			{
				flag = true;
				break;
			}
			else set.add(Integer.parseInt(str[i]));
		}
		
		if(flag)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
}