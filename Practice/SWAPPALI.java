import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine().trim();
			int count = getMaxOps(s.toCharArray(),n);
			if(count == -1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("Yes");
				System.out.println(count);
			}
		}
	}
	public static int getMaxOps(char s[], int n)
	{
		boolean ok=true;
		boolean L=true,R=true;
		int mn=0;
		for(int i=0;i<n/2;i++){
			if(n% 2 == 0 && i == n/2-1){
				if(s[i] != s[n-i-1]){
					ok=false;
				}
				continue;
			}
			if(s[i] == s[n-i-1]){
				L=true;
				R=true;
				continue;
			}
			if(s[i+1] == s[n-i-1] && L==true){
				swap(s,i,i+1);
				L=false;
				R=true;
				mn++;
				continue;
			}
			if(s[i] == s[n-i-2] && R==true){
				swap(s,n-i-1,n-i-2);
				L=true;
				R=false;
				mn++;
				continue;
			}
			ok=false;
			break;
		}
		if(ok == false)
		{
			return -1;
		}
		return mn;
	}
	public static void swap(char c[], int n1, int n2)
	{
		char t = c[n1];
		c[n1] = c[n2];
		c[n2] = t;
		return;
	}
}