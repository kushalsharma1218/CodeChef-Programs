import java.util.*;
import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- >0)
		{
			int n = Integer.parseInt(br.readLine());
			String arr[] = br.readLine().split(" ");
			Arrays.sort(arr);
			Map<String,Set<Character>> map = new HashMap<>();
			for(int i=0;i<arr.length;i++)
			{
				String s = arr[i].substring(1,arr[i].length());
				if(map.containsKey(s))
				{
					Set<Character> set = map.get(s);
					set.add(arr[i].charAt(0));
					
					map.put(s,set);
				}
				else
				{
					Set<Character> set = new HashSet<>();
					set.add(arr[i].charAt(0));
					map.put(s,set);
				}
			}
			
			int count = 0;
			for(Map.Entry<String,Set<Character>> e1 : map.entrySet())
			{
				for(Map.Entry<String,Set<Character>> e2 : map.entrySet())
				{
					if(e1.getKey() != e2.getKey())
					{
						int temp = getDuplicateLength((Set)e1.getValue(),(Set)e2.getValue());
						count += (Math.abs(e1.getValue().size() - temp)) * (Math.abs(e2.getValue().size() - temp));
					}
				}			
			}
			System.out.println(count);
		}
	}
	public static int getDuplicateLength(Set<String> set1, Set<String> set2)
	{
		HashSet<String> has = new HashSet<String>(){{
		
		addAll(set1);
		addAll(set2);
		}};
		return has.size();
	}
}