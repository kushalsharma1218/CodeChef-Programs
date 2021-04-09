import java.util.*;
import java.util.*;
import java.util.*;
import java.io.*;
class Point{
	int x;
	long y;
	
	public Point(int x, long y)
	{
		this.x = x;
		this.y = y;
	}
}
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			List<Point> al1 = new ArrayList<>();
			List<Point> al2 = new ArrayList<>();
			
			for(int i =0;i<n;i++)
			{
				al1.add(new Point(i+1,Long.parseLong(str[i])));
			}
			if(n == 2)System.out.println("1");
			else
			{
				al2.add(al1.get(0));
				al2.add(al1.get(1));
				int ans  = 1;
				int size = al2.size();
				for(int i=2;i<n;i++)
				{
					while(al2.size() >= 2)
					{
						double s1 = ((double)al2.get(size -1).y - (double)al2.get(size -2).y)
						              / ((double)al2.get(size -1).x - (double)al2.get(size -2).x);
						double s2 = ((double)al1.get(i).y - (double)al2.get(size -1).y)
						              / ((double)al1.get(i).x - (double)al2.get(size -1).x);
						if(s1 <= s2)
						{
							al2.remove(size -1);
							size--;
						}
						else break;
					}
					al2.add(al1.get(i));
					size++;
					ans = Math.max(ans,al2.get(size -1).x - al2.get(size -2).x);
				}
				
				System.out.println(ans);
			}
		
		}
	}
}