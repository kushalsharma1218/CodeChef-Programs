import java.io.*;

class A{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		int test=Integer.parseInt(br.readLine());
		for(int t=0;t<test;t++){
				
		int N=Integer.parseInt(br.readLine());
		
		int weapons[][]= new int[N][10];
		
		for(int i=0;i<N;i++)
		{
			String s= br.readLine().trim();
			for(int j=0;j<10;j++){
				
				weapons[i][j]=s.charAt(j);
			}
			
		}
				
	
		for(int i=0;i<N-1;i++)
		{
			findMaximumWeapons(weapons,i,i+1);
		}
		
		int ansCount=0;
		for(int i=0;i<10;i++)
		{
			if(weapons[N-1][i]==49)ansCount++;
		}
		System.out.println(ansCount);
				
		}
	}
	public static int[][] findMaximumWeapons(int weapons[][],int k,int j)
	{
		for(int i=0;i<10;i++)
		{
			if(weapons[k][i]==49 && weapons[j][i]==49)
			{
				weapons[j][i]=0;
			}
			else if(weapons[k][i]==49 || weapons[j][i]==49)
			{
				weapons[j][i]=49;
			}
			else
			{
				weapons[j][i]=0;
			}
		}
	
		return weapons;
	}
}