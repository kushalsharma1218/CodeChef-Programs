import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			String s = br.readLine();
			String p = br.readLine();
			
			showString(s,p);	
		}
	}
	public static void showString(String s,String p)
	{
			StringBuffer sb = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			
			int arr[] = new int[26];
			int arr2[] = new int[26];
			for(int i=0;i<s.length();i++)
			{
				arr[s.charAt(i) - 'a']++;
			}
			for(int i=0;i<p.length();i++)
			{
				arr[p.charAt(i) - 'a']--;
			}
			for(int i=0;i<26;i++)
			{
				arr2[i] = arr[i];
			}
			
			for(int i=0;i<=(p.charAt(0)-'a');i++)
			{
				while(arr[i]>0)
				{
					sb.append((char)(i+97));
					arr[i]--;
				}
			}
			if(sb.length()>0)
			{
				sb.insert(sb.length(), p);
			}
			else
			{
				sb.insert(0,p);
			}
			for(int i=0;i<26;i++)
			{
				while(arr[i]>0)
				{
					sb.append((char)(i+97));
					arr[i]--;
				}
			}
			for(int i=0;i<(p.charAt(0)-'a');i++){
				while(arr2[i]>0)
				{
					sb2.append((char)(i+97));
					arr2[i]--;
				}
			}
			if(sb2.length()>0)
			{
				sb2.insert(sb2.length(), p);
			}
			else
			{
				sb2.insert(0,p);
			}
			
			for(int i=0;i<26;i++)
			{
				while(arr2[i]>0)
				{
					sb2.append((char)(i+97));
					arr2[i]--;
				}
			}
		
			
			 String s1 = sb.toString();
			 String s2 = sb2.toString();
			if(s1.compareTo(s2)>=0) 
			{
				System.out.println(s2);
			}
			else
			{
				System.out.println(s1);
				
			}
			
	}
	
}
