import java.util.*;
import java.io.*;
class Codechef{
	public static void main(String ar[]) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
		 while (t-- > 0) {
			String NQ[]=br.readLine().split(" ");
			int N = Integer.parseInt(NQ[0]);
			int Q = Integer.parseInt(NQ[1]);
			String s=br.readLine().trim();
			while(Q-- > 0){
				int arr[]=new int[26];
				for(int i=0;i<s.length();i++)
				{
					arr[s.charAt(i)-'a']++;
				}
				int c = Integer.parseInt(br.readLine().trim());
				int sum=0;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]-c>0)sum=sum+(arr[i]-c);
				}
				System.out.println(sum);
			}
		 }
	}
}