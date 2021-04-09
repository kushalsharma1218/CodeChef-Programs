
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr1=new int[n+2];
		int[] arr2=new int[n+2];
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    arr1[l]++;
		    arr1[r+1]--;
		    arr2[r+1]-=r-l+1;
		}
		for(int i = 0;i<n+2;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		for(int i = 0;i<n+2;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		for(int i=1;i<=n;i++){
		    arr1[i]+=arr1[i-1];
		    arr2[i]+=arr2[i-1]+arr1[i];
		}
		System.out.println();
		for(int i = 0;i<n+2;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		int m=sc.nextInt();
	StringBuffer str = new StringBuffer("");
        while(m-->0){
            int ind = sc.nextInt();
            str.append(arr2[ind]+"\n");
        }
        System.out.println(str);
	}
}
