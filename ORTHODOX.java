import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		 Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
                label:for(int k=0;k<t;k++)
                {
		    int len=sc.nextInt();
		 long arr[]=new long[len];
		   for(int i=0;i<len;i++)
		   {
		       arr[i]=sc.nextLong();
		   }
		    HashSet<Long> set=new HashSet<>();
		    for(int i=0;i<arr.length;i++)
		    { 
		       
		       long total=arr[i];
		       if(set.contains(total))
		       {
		           System.out.println("NO");
		           continue label;
		       }
		       set.add(total);
		        for(int j=i+1;j<arr.length;j++)
		        {
		            long temp=arr[j];
		            total=total|temp;
		             if(set.contains(total))
		       {
		           System.out.println("NO");
		           continue label;
		       }
		       set.add(total);
		       
		        }
		    }
		     System.out.println("YES");
                }
		}
		catch(Exception e){
		    return;
		}
	}
}