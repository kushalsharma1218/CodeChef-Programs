import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine());
		 while(t-- > 0){
			 String nm[] = br.readLine().split(" ");
			 int n = Integer.parseInt(nm[0]);
			 int m = Integer.parseInt(nm[1]);
			 
			 long fot[] = new long[n];
			 long cri[] = new long[m];
			 
			 String str1[] = br.readLine().split(" ");
			 String str2[] = br.readLine().split(" ");
			 
			 for(int i = 0;i<n;i++)
			 {
				 fot[i] = Long.parseLong(str1[i]);
			 }
			 for(int i = 0;i<m;i++)
			 {
				 cri[i] = Long.parseLong(str2[i]);
			 }
			 
			 
			 int swap = 0;
			 int j = 0;
			 int i = 0;
			 int initial = 0;
			 if(fot[i] > cri[j]){
				 swap++;
				 j++;
				 initial = 1;
			 }else
			 {
				 
				 i++;
			 }
			 while(i<n && j <m)
			 {
				 if(fot[i] < cri[j])
				 {
					 if(initial == 1){
						 swap++;
						 initial = 0;
					 }
					 i++;
				 }
				 else{
					 if(initial == 0)
					 {
						 swap++;
						 initial= 1;
					 }
					 j++;
					 
				 }
			 }
			 if(i != n && initial != 0)swap++;
			 if(j!= m && initial != 1)swap++;
			 
			 System.out.println(swap);
			 
		 }
		

	}
 }